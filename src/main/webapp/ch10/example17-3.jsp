<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>JSP JavaBeans</title>
</head>
<body>
    <jsp:useBean id="hello" class="com.example.bean.HelloBean"/>

    <jsp:getProperty name="hello" property="name"/><br>
    <jsp:getProperty name="hello" property="number"/><br>

    <%-- property="*" --%>
    <jsp:setProperty name="hello" property="*"/>

    <hr>

    <jsp:getProperty name="hello" property="name"/><br>
    <jsp:getProperty name="hello" property="number"/><br>
</body>
</html>
