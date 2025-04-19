<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>URL 액션 1</title>
</head>
<body>
    <c:import var="url" url="exam05.jsp" />

    <h3>import 파일 내용</h3>
    <p>${url}</p>
</body>
</html>
