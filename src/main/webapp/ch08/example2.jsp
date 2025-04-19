<%--속성 예제 1: contentType, language, import--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>

<%
    List<String> list = List.of("유재석", "박명수");
%>

<html>
<head>
    <title>example2</title>
</head>
<body>
    <%=list.get(0)%><br>
    <%=list.get(1)%>
</body>
</html>
