<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>board_list.jsp</title>
</head>
<body>
    <h1>두 번째 테스트 복습</h1>
    <ul>
        <c:forEach var="fruit" items="${board_list}">
            <li>${fruit}</li>
        </c:forEach>
    </ul>
</body>
</html>
