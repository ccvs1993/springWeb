<%--
  Created by IntelliJ IDEA.
  User: wangfei
  Date: 2017/6/29
  Time: 下午3:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>保存</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user_register" method="post">
        用户名<input type="text" name="username"><br>
        密码<input type="text" name="password"><br>
        年龄<input type="text" name="age"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
