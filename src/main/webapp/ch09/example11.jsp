<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>out</title>
</head>
<body>
    <h3>out.print() 메서드</h3>
<%
    out.print("1) 출력 버퍼의 크기 (출력 x): " + out.getBufferSize() + "<br>");
    out.print("1) 출력 버퍼의 남은 크기 (출력 x): " + out.getRemaining() + "<br><br>");
    out.clearBuffer();
    out.print("2) 출력 버퍼의 크기 (출력 o): " + out.getBufferSize() + "<br>");
    out.print("2) 출력 버퍼의 남은 크기 (출력 o): " + out.getRemaining() + "<br><br>");
    out.flush();
    out.print("3) 출력 버퍼의 크기 (출력 x): " + out.getBufferSize() + "<br>");
    out.print("3) 출력 버퍼의 남은 크기 (출력 x): " + out.getRemaining() + "<br><br>");
    out.clearBuffer();
    out.print("4) 출력 버퍼의 크기 (출력 o): " + out.getBufferSize() + "<br>");
    out.print("4) 출력 버퍼의 남은 크기 (출력 o): " + out.getRemaining() + "<br><br>");
%>
    <hr>
<%
    out.print("출력 버퍼의 크기: " + out.getBufferSize() + "<br>");
    out.print(100 + "<br>");
    out.print(true + "<br>");
    out.print(3.14 + "<br>");
    out.print("TEST" + "<br>");
    out.print('가' + "<br>");
    out.print(new java.io.File("\\") + "<br>");
    out.print("출력 버퍼의 남은 크기: " + out.getRemaining());
%>
</body>
</html>
