<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String p = request.getParameter("p");
%>

<html>
<head>
    <title>forward</title>
</head>
<body>
    <jsp:forward page="<%=p%>" />
</body>
</html>
