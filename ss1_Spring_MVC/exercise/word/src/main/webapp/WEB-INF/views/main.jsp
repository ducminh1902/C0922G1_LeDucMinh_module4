<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 1/31/2023
  Time: 3:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Từ điển Anh - Việt</h1>
<form action="/translate" method="post">
    <input name="english" placeholder="Tiếng Anh">
    <br>
    <button type="submit">Dịch</button>
</form>
<h1>${result}</h1>
</body>
</html>
