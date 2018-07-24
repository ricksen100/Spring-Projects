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
<f:form action="update2" method="post" modelAttribute="emp">
  <input type="text" name="id" value=${up.id} readonly }/>
  <f:errors path="id"></f:errors>
  <f:input path="name"/>
   <f:errors path="name"></f:errors>
  <f:input path="salary"/>
  <input type="submit" value="Update"/>
 </f:form>
</body>
</html>