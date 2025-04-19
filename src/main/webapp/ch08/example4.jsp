<%--속성 예제 2: isErrorPage, errorPage--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="example3.jsp" %>

<%
    String param = request.getParameter("id");
%>

<html>
<head>
    <title>example4</title>
</head>
<body>
    id: <%=param%><br>
    id.length: <%=param.length()%>
</body>
</html>
