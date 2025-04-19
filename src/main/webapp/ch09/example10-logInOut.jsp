<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String errorMsg = "";
    boolean showLoginForm = false;

    if (session.isNew() || session.getAttribute("id") == null) {
        showLoginForm = true;

        Object error = request.getAttribute("error");
        if (error != null) {
            errorMsg = (String) error;
        }
    }
%>

<html>
<head>
    <title>로그인/로그아웃</title>
</head>
<body>
    <h1>Home</h1>

    <% if (showLoginForm) { %>
        <p><%= errorMsg %></p>
        <form action="example10-logInOutResult.jsp" method="post">
            <input type="text" name="id" placeholder="ID">
            <input type="text" name="pw" placeholder="PW">
            <input type="submit" value="로그인">
        </form>
    <% } else { %>
        <p><%= request.getSession().getAttribute("id") %>님, 어서오세요 :)</p>
        <a href="example10-logInOutResult.jsp">로그아웃</a>
    <% } %>
</body>
</html>
