<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" %>
<%@ page import="com.example.bean.BookBean" %>

<%
    ArrayList<BookBean> bookList = new ArrayList<>(List.of(new BookBean("책1", "저자1", "출판사1"), new BookBean("책2", "저자2", "출판사2")));
    String[] bookCode = {"소설", "역사", "인문", "정치", "미술", "종교", "여행", "과학", "만화", "건강"};
%>

<html>
<head>
    <title>반복 액션</title>
</head>
<body>
    <c:set var="list" value="<%=bookList%>" />
    <c:forEach var="item" items="${list}">
        ${item.title}/${item.author}/${item.publisher}<br>
    </c:forEach>

    <hr>

    <c:set var="code" value="<%=bookCode%>" />
    <c:forEach var="item" items="${code}">
        <c:out value="${item}" />
    </c:forEach>

    <hr>

    <c:forEach var="j" begin="1" end="9">
        <c:forEach var="i" begin="2" end="9">
            ${i} * ${j} = ${i*j} &nbsp;&nbsp;&nbsp;
        </c:forEach>
        <br>
    </c:forEach>

    <hr>

    <c:forEach var="k" begin="1" end="10" step="2">
        ${k}
    </c:forEach>

    <hr>

    <c:forTokens var="token" items="소설/역사/인문/정치/미술/종교/여행/과학/만화/건강" delims="/">
        ${token}
    </c:forTokens>
</body>
</html>
