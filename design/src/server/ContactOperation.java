package server;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.corba.se.spi.orb.Operation;

import contacts.Telbook;
import contacts.Telbooks;
import javassist.bytecode.Opcode;
import util.XMLUtil;

public class ContactOperation extends ActionSupport {
	String creater;
	String name;
	String phone;
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
		return "index";
	}
	public String insert() throws Exception{
		contacts.Operation operation=new contacts.Operation();
		Telbook telbook=new Telbook(getCreater(),name,phone);
		operation.insertTelbook(telbook);
		return "success";
	}
	public String delete(){
		contacts.Operation operation=new contacts.Operation();
		Telbook telbook=new Telbook(getCreater(),name,phone);
		operation.deleteTelbook(telbook);
		return SUCCESS;
	}

}
