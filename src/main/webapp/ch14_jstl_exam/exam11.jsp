<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>ex2</title>
</head>
<body>
    <%-- messages_ko.properties --%>
    <fmt:setBundle basename="messages" />
    <fmt:message var="name" key="name">
        <fmt:param value="짱구" />
    </fmt:message>

    <p>${name}</p>

    <%-- messages.properties --%>
    <fmt:setLocale value="en" />
    <fmt:setBundle basename="messages" />
    <fmt:message key="name">
        <p><fmt:param>Amy</fmt:param></p>
    </fmt:message>
</body>
</html>
