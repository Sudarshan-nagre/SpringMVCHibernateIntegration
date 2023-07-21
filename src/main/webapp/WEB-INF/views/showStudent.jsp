<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<%@include file="csscdn.html" %>
<meta charset="ISO-8859-1">
<title>Show Student</title>
<%@ include file="navbar.html" %>
</head>
<body>
	<br><br><center>
		<table class="table table-striped" style="width: 50%;">
			<tr>
				<th scope="col">Name</th>
				<th scope="col">Email</th>
				<th scope="col">Mobile</th>
				<th scope="col"></th>
			</tr>
			<c:forEach var="student" items="${lists}">
				<tr>
					<td>${student.name}</td>
					<td>${student.email}</td>
					<td>${student.mobile}</td>
					<td><a href="student/delete?id=${student.id}">Delete</a>
						<a href="student/edit?id=${student.id}">Edit</a>
					</td>
				</tr>
			
			</c:forEach>
		
		</table></center>

</body>
</html>