<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>request param</title>
</head>
<body>
	<h2>Login</h2>
	<form action="loginfb.htm" method="post">
		<p>Username</p>
		<input name="id"/>
		<p>Password</p>
		<input name="pass">
		<hr>
		<button>Login</button>
	</form>
	<h1>${mess}</h1>
</body>
</html>