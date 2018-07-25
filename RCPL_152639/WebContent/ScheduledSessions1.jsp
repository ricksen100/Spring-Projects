<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>SessionName</th>
<th>Duration(Days)</th>
<th>Faculty</th>
<th>Mode</th>

</tr>
<a:forEach items="${emps}" var="t">
<tr>
<td>${t.t_name}</td>
<td>${t.t_duration}</td>
<td>${t.t_faculty}</td>
<td>${t.t_mode}</td>
<td><a href="Success1">Enroll Me</a></td>
</tr>
</a:forEach>
</table>
</body>
</html>