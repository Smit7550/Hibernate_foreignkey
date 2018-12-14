<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="a" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<form action="<%=request.getContextPath()%>/cont" method="post">
Country:-<select name="sss">
			<a:forEach items="${sessionScope.List}" var="i">
				<option value="${i.id}">${i.country}</option> 
			</a:forEach>	
		</select><br><br><br>
State:-
<input type="text" name="state">
<input type="hidden" name="flag" value="insertstate">
<input type="submit">
</form>
</center></body>
</html>