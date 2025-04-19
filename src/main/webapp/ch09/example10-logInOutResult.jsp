<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String id = "";
    String pw = "";
    String message = "";
    boolean showIdPw = false;

    if (request.getMethod().equalsIgnoreCase("post")) {
        id = request.getParameter("id");
        pw = request.getParameter("pw");

        if (id.isEmpty() || pw.isEmpty()) {
            request.setAttribute("error", "아이디 또는 비밀번호를 입력해주세요.");
            request.getRequestDispatcher("example10-logInOut.jsp").forward(request, response);
            return;
        }

        if (session.isNew() || session.getAttribute("id") == null) {
            session.setAttribute("id", id);
            message = "로그인 성공 :)";
            showIdPw = true;
        } else {
            message = "이미 로그인 상태입니다.";
        }

    } else if (request.getMethod().equalsIgnoreCase("get")) {
        if (session != null && session.getAttribute("id") != null) {
            session.invalidate();
            message = "로그아웃 성공 :)";
        } else {
            message = "현재 로그인 상태가 아닙니다.";
        }
    }
%>

<html>
<head>
    <title>로그인/로그아웃 결과</title>
</head>
<body>
    <p><%= message %></p>

    <% if (showIdPw) { %>
        <p>입력한 ID/PW는 <%= id %>/<%= pw %>입니다.</p>
    <% } %>

    <a href="example10-logInOut.jsp"><- Home으로 이동</a>
</body>
</html>
