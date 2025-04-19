<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>

<html>
<head>
    <title>DB Test 1</title>
</head>
<body>
<%
    String dbURL = "jdbc:mysql://localhost:3306/firstservletjsp";
    String dbID = "firstservletjsp-user";
    String dbPW = "1234";

    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
        connection = DriverManager.getConnection(dbURL, dbID, dbPW);
        statement = connection.createStatement();

        //statement.executeUpdate("create table test (id varchar(10), pw varchar(10))");

        statement.executeUpdate("insert into test values ('testA', '1111')");
        statement.executeUpdate("insert into test values ('testB', '2222')");
        statement.executeUpdate("insert into test values ('testC', '3333')");

        resultSet = statement.executeQuery("select * from test");
        while (resultSet.next()) {
            out.print(resultSet.getString("id") + " / " + resultSet.getString("pw") + "<br>");
        }
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        resultSet.close();
        statement.close();
        connection.close();
    }
%>
</body>
</html>
