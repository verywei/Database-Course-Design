<%@page import="contacts.Login"%>
<%@page import="contacts.Operation"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Operation operation=new Operation();
	Login l= operation.selectByUser(request.getParameter("username"));
	if(l!=null&&l.getPassword().equals(request.getParameter("password"))){
		out.print(l.getId());
	}
	else{
		out.print("0");
	}
%>