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
<form action="<%=request.getContextPath()%>/cont" method="post">
<input type="hidden" name="flag" value="update">
<a:set value="${sessionScope.state}"  var="n"></a:set>
<a:set value="${sessionScope.country}"  var="c"></a:set>
Country:-<select name="aaa">
<a:forEach items="${sessionScope.List}" var="j">

<a:if test="${c eq j.country}"><option value="${j.id}" selected="selected">${j.country}</option></a:if>
<a:if test="${c ne j.country}"><option value="${j.id}">${j.country}</option></a:if>
</a:forEach> 	
</select><br><br><br>
State:-
<input type="text" name="state" value="${n}">
<input type="submit">
</form>
</center>
</body>
</html>