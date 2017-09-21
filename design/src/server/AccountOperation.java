package server;

import java.text.SimpleDateFormat;

import com.opensymphony.xwork2.Action;

import account.Account;
import contacts.Operation;

public class AccountOperation implements Action {
	String creator,kind,amount,locate;
	
	public String getLocate() {
		return locate;
	}

	public void setLocate(String locate) {
		this.locate = locate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	public String insert() throws Exception{
		Operation operation=new Operation();
		java.util.Date date=new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Account account=new Account("1",getCreator(),getKind(),sdf.format(date),Double.parseDouble(getAmount()),2200.00,getLocate());
		operation.insertAccount(account);
		return SUCCESS;
	}
	public String delete() throws Exception{
		Operation operation=new Operation();
		java.util.Date date=new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Account account=new Account("1",getCreator(),getKind(),sdf.format(date),Double.parseDouble(getAmount()),2200.00,getLocate());
		operation.insertAccount(account);
		return SUCCESS;
	}

}
