<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>example7</title>
</head>
<body>
    <%
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                out.print(i + " * " + j + " = " + (i * j)); %><br>
         <% } %><br>
     <% } %>
</body>
</html>
