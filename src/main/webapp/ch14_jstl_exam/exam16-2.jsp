<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<head>
    <title>sql 2-2</title>
</head>
<body>
    <sql:setDataSource var="mysqlDataSource2"
                       driver="com.mysql.cj.jdbc.Driver"
                       url="jdbc:mysql://localhost:3306/firstservletjsp"
                       user="firstservletjsp-user"
                       password="1234"
    />

    <sql:transaction dataSource="${mysqlDataSource2}">
        <sql:update>
            update test set pw=0000 where id='testA'
        </sql:update>
        <sql:update>
            insert into test values ('hi', 5555)
        </sql:update>
    </sql:transaction>

    <sql:query var="resultSet" dataSource="${mysqlDataSource2}">
        select * from test
    </sql:query>

    <table border="1">
        <tr>
            <c:forEach var="columnName" items="${resultSet.columnNames}">
                <th><c:out value="${columnName}" /></th>
            </c:forEach>
        </tr>
        <c:forEach var="row" items="${resultSet.rows}">
            <tr>
                <td><c:out value="${row.id}" /></td>
                <td><c:out value="${row.pw}" /></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
