<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add User Page</title>
</head>
<body>
<sf:form method="post" action="save" modelAttribute="user">
    <sf:input path="name"/><br>
    <sf:input path="age"/><br>
    <input type="submit" value="save"/><br>
</sf:form>
</body>
</html>
