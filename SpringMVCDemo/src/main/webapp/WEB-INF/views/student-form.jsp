<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    
<!DOCTYPE html>
<html>
<head>

<title>Student Form</title>
</head>
<body style="background-image: url('${pageContext.request.contextPath}/resources/home.jpg');">
	<form:form action="processForm" modelAttribute="student">	<br><br>
	FirstName::<form:input path="firstName"/>	<br><br>
	LastName::<form:input path="lastName"/><br><br>
	Country:<form:select path="country">
	<form:options items="${student.countriesOptions}"/>
	</form:select>/
	<br><br>
	<input type="submit" value="SUBMIT">
	
	</form:form>

</body>
</html>