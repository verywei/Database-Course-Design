<%@page import="util.XMLUtil"%>
<%@page import="contacts.Telbooks"%>
<%@page import="contacts.Operation"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	Operation operation=new Operation();
	String xml=operation.selectByCreater(request.getParameter("creater"));
	out.println(xml);
	
 %>
