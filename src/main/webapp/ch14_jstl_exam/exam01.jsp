<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.bean.BookBean" %>

<html>
<head>
    <title>기본 액션 1-1</title>
</head>
<body>
    <c:set var="name" value="Amy" />
    <c:out value="${name}" /><br>

    <c:remove var="name" />
    <c:out value="${name}" /><br>

<%
    BookBean book1 = new BookBean("책1", "저자1", "출판사1");
    request.setAttribute("bookOne", book1);
%>

    <c:set var="title" value="${bookOne.title}" />
    <c:out value="${title}" /><br>

    <c:set var="author" value="<%=book1.getAuthor()%>" />
    <c:out value="${author}" /><br>

    <hr>

    <c:set var="name">Tobey</c:set>
    <c:out value="${name}" /><br>

<%
    BookBean book2 = new BookBean("책2", "저자2", "출판사2");
    request.setAttribute("bookTwo", book2);
%>

    <c:set var="title">${bookTwo.title}</c:set>
    <c:out value="${title}" /><br>

    <c:set var="author"><%=book2.getAuthor()%></c:set>
    <c:out value="${author}" /><br>
</body>
</html>
