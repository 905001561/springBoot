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

    <script src="../static/jquery.min.js"></script>
</head>
<script type="text/javascript">
    var tempList='${tempList}';
    $(function () {
        $('button').click(function(){
            $.ajax({
                type: "GET",
                url: "helloAjax",
                data: {},
                dataType: "text",
                success: function(data){
                    alert(data);
                }
            });
        });
    });

</script>
<body>
<img src="../static/1.jpg" style="width: 100px;height: 100px;">
<button>后台加载数据</button>
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
