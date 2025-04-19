<%--속성 예제 2: isErrorPage, errorPage--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true" %>

<html>

<head>
    <title>example3_에러처리페이지</title>
</head>
<body>
    <h1>다음과 같은 에러가 발생하였습니다.</h1>
    에러타입: <%=exception.getClass().getName()%><br>
    에러메세지: <%=exception.getMessage()%>
</body>
</html>
