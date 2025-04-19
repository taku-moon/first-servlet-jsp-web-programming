<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>example22</title>
</head>
<body>
    <jsp:useBean id="book" class="com.example.bean.BookBean"/>
    <jsp:setProperty name="book" property="*"/>
<%
    request.setAttribute("requestBook", book);
    session.setAttribute("sessionBook", book);
    application.setAttribute("applicationBook", book);
%>
    <jsp:forward page="bookOutput.jsp"/>
</body>
</html>
