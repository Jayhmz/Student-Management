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
				</tr>


			</c:forEach>

		</table>
	</div>

</body>
</html>