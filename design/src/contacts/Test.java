package contacts;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.mysql.fabric.xmlrpc.base.Data;
import com.sun.corba.se.impl.oa.poa.POACurrent;

import account.Account;
import account.Accounts;
import util.XMLUtil;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Telbook telbook=new Telbook("1","ww","12312312312");
		// Telbook telbook1=new Telbook("2","qq","12312312312");
		// List<Telbook> list=new ArrayList<Telbook>();
		// list.add(telbook);
		// list.add(telbook1);
		// Telbooks telbooks=new Telbooks();
		// telbooks.setTelbooks(list);
		// String xml=XMLUtil.convertToXml(telbooks);
		// System.out.println(xml);
		//
		// Telbooks telbooks2=XMLUtil.converyToJavaBean(xml,Telbooks.class);
		//
		// System.out.println(telbooks2.toString());
		Operation operation = new Operation();
//		String xml = operation.selectByCreater("1");
//		Telbooks telbooks = XMLUtil.converyToJavaBean(xml, Telbooks.class);
//		System.out.println(telbooks.getTelbooks().get(1).toString());
//		System.out.println(operation.selectByUser("13244483996").toString());
		String xml=operation.selectAccountByCreater("1");
		java.util.Date date=new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Account account=new Account("1","1","Ö§³ö",sdf.format(date),100.00,2200.00,"Îç·¹");
		operation.insertAccount(account);
		
		Accounts accounts=XMLUtil.converyToJavaBean(xml, Accounts.class);
		System.out.println(XMLUtil.convertToXml(accounts));
		
	}
}
