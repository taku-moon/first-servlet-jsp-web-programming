<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<head>
    <title>sql 1-1</title>
</head>
<body>
    <sql:query var="resultSet" dataSource="${applicationScope.mysqlDataSource}">
        select * from test
    </sql:query>

    <table>
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
