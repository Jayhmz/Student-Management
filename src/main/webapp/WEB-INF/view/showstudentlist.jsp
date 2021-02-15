<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>JTEKO STUDENT APP</h2>
	<hr>

	<div align="center">

		<table border="1">

			<thead>
				<tr>
					<td>S/N</td>
					<td>Name</td>
					<td>Phone Number</td>
					<td>Matric Number</td>
				</tr>
			</thead>

			<c:forEach var="students" items="${students}">

				<tr>
					<td>${students.id}</td>
					<td>${students.name}</td>
					<td>${students.phone}</td>
					<td>${students.matno}</td>
					<td><a href="/student-management/update?userId=${students.id}">Update</a></td>
					<td><a href="/student-management/delete?userId=${students.id}"
						onclick="if(!(confirm('Are you sure you want to delete this?'))) return false">Delete</a></td>
				</tr>


			</c:forEach>

		</table>

		<form action="register">
			<input type="submit" value="ADD">
		</form>
	</div>

</body>
</html>