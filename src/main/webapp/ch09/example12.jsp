<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Set" %>

<html>
<head>
    <title>application</title>
</head>
<body>
    <p>서버명: <%=application.getServerInfo()%></p>
    <p>서블릿 버전: <%=application.getMajorVersion()%>.<%=application.getMinorVersion()%></p>
    <p>/ch09 리스트<br>
<%
    Set<String> list = application.getResourcePaths("/ch09");
    if (list != null) {
        Object[] objs = list.toArray();
        for (Object obj : objs) {
            out.print(obj + "<br>");
        }
    }
%>
    </p>
</body>
</html>
