<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/2/2023
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Email List</h1>
<table>
    <tr>
        <th>#</th>
        <th>Language</th>
        <th>Page Size</th>
        <th>Spam Filter</th>
        <th>Signature</th>
        <th>Edit</th>
    </tr>
    <c:forEach var="email" items="${list}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${email.language}</td>
            <td>${email.pageSize}</td>
            <c:if test="${email.spamsFilter}">
                <td>Enable</td>
            </c:if>
            <c:if test="${!email.spamsFilter}">
                <td>Disable</td>
            </c:if>
            <td>${email.signature}</td>
            <td><a href="/showForm/${email.id}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
