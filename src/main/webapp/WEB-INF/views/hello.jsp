<%--
  Created by IntelliJ IDEA.
  User: feng
  Date: 2019/1/26
  Time: 11:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
    </tr>
    <c:forEach items="${tempList}" var="s" varStatus="st">
        <tr>
            <td>${s.phone}</td>
            <td>${s.procSn}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
