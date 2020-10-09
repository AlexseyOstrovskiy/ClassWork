<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>manishjavadve.com</title>
</head>
<body>

	<center>
		<h1>
			<span style="color: lightblue">Hi Welcome to Spring MVC World</span>
		</h1>
		<h1>
			<span style="color: green">Hi! ${user.username} you are login
				successfully</span>
		</h1>
		<h1>
			<span style="color: lightblue">This is your home page</span>
		</h1>
		<form:form method="GET" action="get-model" modelAttribute="user">

        			<table>
        				<tr>
        					<td>UserName :</td>
        					<td><form:input path="username" /></td>
        					<td><form:errors path="username" cssClass="error" /></td>
        				</tr>

        				<tr>
        					<td>Password :</td>
        					<td><form:password path="password" /></td>
        					<td><form:errors path="password" cssClass="error" /></td>
        				</tr>
        				<tr>
        					<td colspan="3"><input type="submit" value="Check Model" /></td>
        				</tr>
        			</table>
        		</form:form>
	</center>


</body>