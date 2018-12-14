<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<table border=1>
<th>SID</th>
<th>State Name</th>
<th>Country Name</th>
<th>Action</th>

<a:forEach items="${sessionScope.List1}" var="j">
<tr>
<td>${j.sid}</td>
<td>${j.state}</td>
<td>${j.cvo.country}</td>
<td><a href="<%=request.getContextPath()%>/cont?state=${j.state}&country=${j.cvo.country}&id=${j.sid}&flag=edit">Edit</a></td>
</tr>
</a:forEach>

</table>
</center>
</body>
</html>