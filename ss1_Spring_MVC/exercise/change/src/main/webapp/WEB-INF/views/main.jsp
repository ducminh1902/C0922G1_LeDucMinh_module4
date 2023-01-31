<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 1/31/2023
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Chuyển đổi tiền tệ</h1>
<br>
<form action="/change" method="post">
    <input name="USD" placeholder="USD">
    <button type="submit">change</button>
</form>
<h1>${vnd}VND</h1>
</body>
</html>
