<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>JSP JavaBeans</title>
</head>
<body>
    <jsp:useBean id="hello" class="com.example.bean.HelloBean"/>

    <jsp:getProperty name="hello" property="name"/><br>
    <jsp:getProperty name="hello" property="number"/><br>

    <%-- value --%>
    <jsp:setProperty name="hello" property="name" value="Hello"/>
    <jsp:setProperty name="hello" property="number" value="12345"/>

    <hr>

    <jsp:getProperty name="hello" property="name"/><br>
    <jsp:getProperty name="hello" property="number"/><br>
</body>
</html>
