<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Enumeration" %>

<html>
<head>
    <title>EL 내장객체 header</title>
</head>
<body>
<%
    Enumeration<String> list = request.getHeaderNames();
    while (list.hasMoreElements()) {
        String key = list.nextElement();
        out.print(key + ": " + request.getHeader(key) + "<br>");
    }
%>
    <hr>
    ${header}
</body>
</html>
