<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2/2/2023
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Form Edit</h1>
<form:form action="/emailEdit" method="post" modelAttribute="email">
   <b>Language</b>
    <br>
 <form:hidden path="id" value="${email.id}"></form:hidden>
 <form:input type="text" path="language" value="${email.language}"></form:input>
    <br>
    <b>Page Size</b>
    <br>
 <form:input type="text" path="pageSize" value="${email.pageSize}"></form:input>
    <br>
    <b>Spam Filter</b>
    <br>
 <form:input type="text" path="spamsFilter" value="${email.spamsFilter}"></form:input>
<%--    <input type="text" value="${emailEdit.spamsFilter}">--%>
    <br>
    <b>Signature</b>
    <br>
 <form:input type="text" path="signature" value="${email.signature}"></form:input>
<%--    <input type="text" value="${emailEdit.signature}">--%>
    <br>
    <button type="submit">Save</button>
</form:form>

</body>
</html>
