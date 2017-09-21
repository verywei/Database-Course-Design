package server;

import com.opensymphony.xwork2.Action;

import contacts.Operation;
import contacts.Telbook;

public class ContentInsert implements Action {
	String creater,name,phone;
	
	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String execute() throws Exception {
		Operation operation=new Operation();
		Telbook telbook=new Telbook(creater,name,phone);
		operation.insertTelbook(telbook);
		return SUCCESS;
	}

}
