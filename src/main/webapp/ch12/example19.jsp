<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>EL 내장객체 param 1</title>
</head>
<body>
    <p><%=request.getParameter("id")%> / <%=request.getParameter("pw")%></p>

    <p>${param.id} / ${param.pw}</p>
    <p>${param["id"]} / ${param["pw"]}</p>
</body>
</html>
