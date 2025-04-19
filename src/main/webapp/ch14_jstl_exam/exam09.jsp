<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>fmt:requestEncoding</title>
</head>
<body>
    <fmt:requestEncoding value="UTF-8" />

    Parameters: ${param.name} <br>

    <form action="exam09.jsp" method="post">
        <input type="text" name="name" placeholder="이름">
        <input type="submit" value="전송">
    </form>
</body>
</html>
