<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>로케일 x 및 fallback</title>
</head>
<body>
    <%-- messages_ko.properties --%>
    <%-- 로케일을 명시하지 않으면 클라이언트(브라우저)의 요청 로케일을 기준으로 동작 --%>
    <%-- request.getLocale() → 클라이언트(브라우저)의 Accept-Language 헤더 값 사용 --%>
    <fmt:bundle basename="messages">
        <p><fmt:message key="id" /></p>
        <p><fmt:message key="greeting" /></p>
    </fmt:bundle>

    <%-- messages.properties --%>
    <%-- messages_de.properties 지원 x -> 기본 번들인 messages.properties로 fallback --%>
    <fmt:setLocale value="de" />
    <fmt:bundle basename="messages">
        <p><fmt:message key="id" /></p>
        <p><fmt:message key="greeting" /></p>
    </fmt:bundle>
</body>
</html>
