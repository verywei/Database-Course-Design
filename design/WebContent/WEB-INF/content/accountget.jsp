<%@page import="contacts.Operation"%>
<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Operation operation=new Operation();
	out.print(operation.selectAccountByCreater(request.getParameter("creator")));
%>