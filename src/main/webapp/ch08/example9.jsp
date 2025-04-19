<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%!
    public int sum(int a, int b) {
        return a+b;
    }
%>

<html>
<head>
    <title>example9</title>
</head>
<body>
    <h3>선언문으로 구현한 덧셈</h3>
    20 + 30 = <%=this.sum(20, 30)%>
</body>
</html>
