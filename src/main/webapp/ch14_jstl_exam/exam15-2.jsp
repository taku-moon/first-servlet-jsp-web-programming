<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<html>
<head>
    <title>sql 1-2</title>
</head>
<body>
    <sql:update dataSource="${applicationScope.springDataSource}">
        update test set pw=? where id=?
        <sql:param value="${1004}" />
        <sql:param value="${'hello'}" />
    </sql:update>

    <sql:query var="resultSet" dataSource="${applicationScope.springDataSource}">
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
