<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.bean.BookBean" %>

<%
    BookBean book = new BookBean();
%>

<html>
<head>
    <title>기본 액션 1-2</title>
</head>
<body>
    <c:set target="<%=book%>" property="title" value="Servlet&JSP" />
    <p><%=book.getTitle()%></p>

    <c:set var="b" value="<%=book%>" />
    <c:set target="${b}" property="author" value="오정임" />
    <p>${b.author}</p>
</body>
</html>
