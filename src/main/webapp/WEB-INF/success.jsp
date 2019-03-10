<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 今晚打老虎
  Date: 2019/3/8
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <h1>SUCCESS</h1>
        <c:forEach var="entity" items="${list}">
                <h6>${entity.id}</h6>

        </c:forEach>
</body>
</html>
