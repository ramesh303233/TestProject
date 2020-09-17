<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Location</title>
</head>
<body>

<form action="saveEmployee" method="post">
<pre>
Id: <input type="text" name="id"/>
username: <input type="text" name="username"/>
Password: <input type="password" name="password"/>
Email: <input type="text" name="email"/>
Mobile: <input type="text" name="mobile"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}

<a href="displayEmployees">View All</a>

</body>
</html>