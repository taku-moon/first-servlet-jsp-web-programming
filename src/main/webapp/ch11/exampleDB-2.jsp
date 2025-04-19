<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>

<html>
<head>
    <title>DB Test 2</title>
</head>
<body>
<%
    String dbURL = "jdbc:mysql://localhost:3306/firstservletjsp";
    String dbID = "firstservletjsp-user";
    String dbPW = "1234";

    try (Connection connection = DriverManager.getConnection(dbURL, dbID, dbPW);
         Statement statement = connection.createStatement();
         PreparedStatement preparedStatement = connection.prepareStatement("insert into test values (?, ?)")
    ) {
        preparedStatement.setString(1, request.getParameter("id"));
        preparedStatement.setString(2, request.getParameter("pw"));
        preparedStatement.executeUpdate();

        try (ResultSet resultSet = statement.executeQuery("select * from test");) {
            while (resultSet.next()) {
                out.print(resultSet.getString("id") + " / " + resultSet.getString("pw") + "<br>");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
%>
</body>
</html>
