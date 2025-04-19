<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>기본 액션 2</title>
</head>
<body>
    <c:catch var="e">
    <%
        String str = request.getParameter("msg");
        if (str.equals("add")) {
            out.print(str);
        }
    %>
    </c:catch>

    <c:out value="${e}" />
</body>
</html>
