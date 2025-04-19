<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>조건 액션</title>
</head>
<body>
    <c:set var="num" value="${95}" />

    <p>
        점수 <c:out value="${num}" />점은
        <c:if test="${num>60}">합격입니다.</c:if>
    </p>

    <p>
        점수 <c:out value="${num}" />점은
        <c:choose>
            <c:when test="${num>=90}">A학점입니다.</c:when>
            <c:when test="${num>=80}">B학점입니다.</c:when>
            <c:when test="${num>=70}">C학점입니다.</c:when>
            <c:when test="${num>=60}">D학점입니다.</c:when>
            <c:otherwise>F학점입니다.</c:otherwise>
        </c:choose>
    </p>
</body>
</html>
