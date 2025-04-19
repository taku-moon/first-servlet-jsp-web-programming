<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.DataSource" %>

<html>
<head>
    <title>DB Test 3</title>
</head>
<body>
<%
    DataSource dataSource = (DataSource) application.getAttribute("mysqlDataSource");
    out.print("<h3>" + dataSource.getClass().getName() + "</h3>");

    if (dataSource != null) {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from test");
        ){
            while (resultSet.next()) {
                out.print(resultSet.getString("id") + " / " + resultSet.getString("pw") + "<br>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
%>
</body>
</html>
