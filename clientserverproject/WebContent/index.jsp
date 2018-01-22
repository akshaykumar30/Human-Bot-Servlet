<%@ page import="com.akshay.clientserver" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Human - Bot</title>
<style>
body{
background:grey;}
h3{
	text-align:center;
	text-transform:uppercase;
	}
</style>
</head>
<body>
<h3>Hey Service, can you provide me a question with numbers to add?</h3>
<%
String xom = (String)request.getAttribute("xvalue");
String yom = (String)request.getAttribute("yvalue");
String zom = (String)request.getAttribute("zvalue");

out.println("Prev question: Please sum the numbers " +xom  +yom  +zom);
%>
<form action="clientserver" method="post">
<p>The answer is <input type="text" name="answer" placeholder="Enter your answer here"></p>
<button type="submit" value="submit"> SUBMIT</button>
</form>

</body>  
</html>