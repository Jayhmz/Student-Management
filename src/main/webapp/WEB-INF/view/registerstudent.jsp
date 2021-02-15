<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<form:form action="save-student" method="POST" modelAttribute="student">

			<form:hidden path="id"/>
			
			<label>Name : </label>
			<form:input path="name" />
			<br />

			<label>Email : </label>
			<form:input path="email" />
			<br />

			<label>Matric No : </label>
			<form:input path="matno" />
			<br />

			<label>Phone : </label>
			<form:input path="phone" />
			<br />

			<input type="submit" value="Register" />

		</form:form>
	</div>

</body>
</html>