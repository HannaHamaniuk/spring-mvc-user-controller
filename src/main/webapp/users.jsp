<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users Page</title>
</head>
<body>
<table border="1">
    <tr>
        <th> id</th>
        <th> name</th>
        <th> age</th>
        <th> actions</th>
    </tr>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td><a href="/delete?id=${user.id}">delete</a></td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
