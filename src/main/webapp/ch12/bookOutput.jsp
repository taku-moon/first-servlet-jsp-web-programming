<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.bean.BookBean" %>

<html>
<head>
    <title>Book Output</title>
</head>
<body>
    <%-- reques 정보 추출 --%>
    <%=((BookBean) request.getAttribute("requestBook")).getTitle()%><br>
    ${requestBook.author}<br>
    ${requestBook.publisher}<br>
    <hr>

    <%-- session 정보 추출 --%>
    <%=((BookBean) session.getAttribute("sessionBook")).getTitle()%><br>
    ${sessionBook.author}<br>
    ${sessionBook.publisher}<br>
    <hr>

    <%-- applicatio 정보 추출 --%>
    <%=((BookBean) application.getAttribute("applicationBook")).getTitle()%><br>
    ${applicationBook.author}<br>
    ${applicationBook.publisher}<br>
</body>
</html>
