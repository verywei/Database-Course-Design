package contacts;

import java.io.Reader;
import java.util.Iterator;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sun.istack.internal.logging.Logger;

import account.Account;
import account.AccountOperation;
import account.Accounts;
import util.XMLUtil;

public class Operation {
	private static SqlSessionFactory sqlSessionFactory;
	private static Reader reader;
	Logger logger = Logger.getLogger(Operation.class);

	static {
		try {
			reader = Resources.getResourceAsReader("Configuration.xml");
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSession() {
		return sqlSessionFactory;
	}

	public void selectUserByID(String userID) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PeopleOperation peopleOperatin = session.getMapper(PeopleOperation.class);
			People people = peopleOperatin.selectById(userID);
			if (people != null) {
				System.out.println(people.toString());
			}

		} finally {
			session.close();
		}
		logger.info("select people");
	}

	public void insertPeople(People people) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PeopleOperation peopleOperation = session.getMapper(PeopleOperation.class);
			peopleOperation.addPeople(people);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void updatePeople(People people) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PeopleOperation peopleOperation = session.getMapper(PeopleOperation.class);
			peopleOperation.updatePeople(people);
			session.commit();
		} finally {
			session.close();
		}
	}

	public void deletePeople(String id) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			PeopleOperation peopleOperation = session.getMapper(PeopleOperation.class);
			peopleOperation.deletePeople(id);
			session.commit();
		} finally {
			session.close();
		}
	}

	public String selectByCreater(String creater) {
		SqlSession session = sqlSessionFactory.openSession();
		String xml = null;
		try {
			TelbookOperation telbookOperation = session.getMapper(TelbookOperation.class);
			List<Telbook> telbooks = telbookOperation.selectByCreater(creater);
			Telbooks telbooks2 = new Telbooks();
			telbooks2.setTelbooks(telbooks);
			xml = XMLUtil.convertToXml(telbooks2);
			System.out.println(xml);
		} finally {
			session.close();
		}
		return xml;
	}

	public void insertTelbook(Telbook telbook) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			TelbookOperation telbookOperation = session.getMapper(TelbookOperation.class);
			telbookOperation.addTelbook(telbook);
			session.commit();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateTelbook(Telbook telbook) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			TelbookOperation telbookOperation = session.getMapper(TelbookOperation.class);
			telbookOperation.updateTelbook(telbook);
			// session.commit();
		} finally {
			// TODO: handle finally clause
		}
	}

	public void deleteTelbook(Telbook telbook) {
		SqlSession session = sqlSessionFactory.openSession();
		try {
			TelbookOperation telbookOperation = session.getMapper(TelbookOperation.class);
			telbookOperation.deleteTelbook(telbook);
			session.commit();
		} finally {
			// TODO: handle finally clause
		}
	}
	public Login selectByUser(String phone) {
		SqlSession session=sqlSessionFactory.openSession();
		Login login;
		try {
			LoginOperation loginOperation=session.getMapper(LoginOperation.class);
			 login=loginOperation.selectByPhone(phone);
		} finally {
			// TODO: handle finally clause
		}
		return login;
	}
	public String selectAccountByCreater(String creater){
		SqlSession session = sqlSessionFactory.openSession();
		String xml = null;
		try {
			AccountOperation accountOperation=session.getMapper(AccountOperation.class);
			List<Account> list=accountOperation.selectByCreater(creater);
			Accounts accounts=new Accounts();
			accounts.setAccounts(list);
			xml=XMLUtil.convertToXml(accounts);
		} finally {
			session.close();
		}
		return xml;
	}
	public String insertAccount(Account account){
		SqlSession session=sqlSessionFactory.openSession();
		try {
			AccountOperation accountOperation=session.getMapper(AccountOperation.class);
			List<Account> list=accountOperation.selectByCreater(account.getCreator());
			Account accountlast=list.get(list.size()-1);
			if (account.getKind().equals(" ’»Î")) {
				account.setSum(accountlast.getSum()+account.getAmount());
			}else {
				account.setSum(accountlast.getSum()-account.getAmount());
			}
			accountOperation.insertAccount(account);
			session.commit();
		} finally {
			session.close();
		}
		return "1";
	}
}
