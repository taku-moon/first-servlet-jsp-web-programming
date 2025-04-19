<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>URL 액션 2</title>
</head>
<body>
    <c:url var="page" value="exam08.jsp">
        <c:param name="id" value="guest" />
        <c:param name="pw" value="1234" />
    </c:url>

    <c:redirect url="${page}" />
</body>
</html>
