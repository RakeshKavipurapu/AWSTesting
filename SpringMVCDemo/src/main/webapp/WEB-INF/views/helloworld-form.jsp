<!DOCTYPE Html>
<html>
<head>
<title>HelloWorld-Form</title>
</head>
<body <%-- style="background-image: url('${pageContext.request.contextPath}/resources/inputpage.jpg'); --%>>
<h1 >Welcome to Spring MVC part 2</h1>
<br><br>
<form action="processFormVersion3" method="get">
<input type="text" placeholder="What's your name" name="studentName">
<br><br>
<input type="submit" value="submitData">
</form>

</body>


</html>