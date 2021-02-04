<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="register" method="GET" modelAttribute="student" >
	
		<label >Name : </label>
		<form:input path="name" />
		
		<label >Email : </label>
		<form:input path="email"/>
		
		<label >Matric No : </label>
		<form:input path="matno"/>
		
		<label >Phone : </label>
		<form:input path="phone"/>
		
		<input type="submit" value="Register"/>
		
	</form:form>

</body>
</html>