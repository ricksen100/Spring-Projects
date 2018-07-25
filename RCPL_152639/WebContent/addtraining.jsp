<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="addtraining1" method="post" modelAttribute="emp">
 ID: <f:input path="t_id"/>
  <f:errors path="t_id"></f:errors></br>
  Name:<f:input path="t_name"/>
   <f:errors path="t_name"></f:errors></br>
 Duration: <f:input path="t_duration"/>
   <f:errors path="t_duration"></f:errors></br>
 Faculty:   <f:input path="t_faculty"/>
   <f:errors path="t_faculty"></f:errors></br>
 Mode:   <f:input path="t_mode"/>
   <f:errors path="t_mode"></f:errors></br>
  <input type="submit" value="Add"/>
 </f:form>
</body>
</html>