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
<h1>
<a href="3.jsp">Country</a>&nbsp;&nbsp;|
<a href="<%=request.getContextPath()%>/cont?flag=state">State</a><br><br>
<a href="<%=request.getContextPath()%>/cont?flag=displaytable">Display Table</a>
</h1>
</center>
</body>
</html>