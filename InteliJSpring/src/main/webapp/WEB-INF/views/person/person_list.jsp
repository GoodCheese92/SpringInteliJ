<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>person_list.jsp</title>
</head>
<body>
    <table>
        <caption>사람 리스트</caption>
        <tr>
            <th>이름</th>
            <th>나이</th>
            <th>전화번호</th>
        </tr>
        <c:forEach var="vo" items="${person_list}">
            <tr>
                <td>${vo.name}</td>
                <td>${vo.age}</td>
                <td>${vo.tel}</td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="3">${ip}</td>
        </tr>
    </table>
</body>
</html>
