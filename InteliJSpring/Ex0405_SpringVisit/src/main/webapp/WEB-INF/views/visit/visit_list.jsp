<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <caption>방명록 리스트</caption>

        <c:forEach var="vo" items="${visit_list}">
        <tr>
            <th>테스트</th>
            <td>${vo.name}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
