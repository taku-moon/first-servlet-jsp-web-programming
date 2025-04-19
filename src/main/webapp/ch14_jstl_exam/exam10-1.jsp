<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>ex1</title>
</head>
<body>
    <%-- messages_ko.properties --%>
    <fmt:setLocale value="ko" />
    <fmt:bundle basename="messages">
        <p><fmt:message key="id" /></p>
        <p><fmt:message key="greeting" /></p>
    </fmt:bundle>

    <%-- messages_ja.properties --%>
    <fmt:setLocale value="ja" />
    <fmt:setBundle basename="messages" />
    <p><fmt:message key="id" /></p>
    <p><fmt:message key="greeting" /></p>
</body>
</html>
