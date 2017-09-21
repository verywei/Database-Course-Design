package server;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import contacts.Operation;

public class Login implements Action {
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String execute() throws Exception {
		Operation operation=new Operation();
		contacts.Login login= operation.selectByUser(getUsername());
		if (login!=null) {
			if (login.getPhone().equals(getUsername())&&login.getPassword().equals(getPassword())) {
				return SUCCESS;
			}else {
				return ERROR;
			}
		}else {
			return ERROR;
		}
//		if (getUsername().equals("13244483996")&&getPassword().equals("wei123")) {
//			return SUCCESS;
//		}else {
//			return ERROR;
//		}
	}
	
}
