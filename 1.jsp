<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="<%=request.getContextPath()%>/cont" method="post">
Firstname<input type="text" name="fn"><br><br>
Lastname<input type="text" name="ln"><br><br>
Username<input type="text" name="un"><br><br>
Password<input type="text" name="pw"><br><br>
<input type="hidden" name="flag" value="insert">
<input type="submit">
</form>
</center>
</body>
</html>