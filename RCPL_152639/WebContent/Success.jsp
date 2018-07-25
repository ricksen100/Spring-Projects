<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>You are enrolled to:
<f:form  method="get" modelAttribute="emp">
 

 <input type="text" name="t_name" value=${up.t_name} readonly}/>

 <f:errors path="t_name"></f:errors>

</f:form>
session</b>
</body>
</html>