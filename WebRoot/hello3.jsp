<%--
  Created by IntelliJ IDEA.
  User: lwg
  Date: 15/9/23
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<form name="upload" action="/springMVC9/file/upload2" enctype="multipart/form-data" method="post">
  <input type="file" name="thefile" /> <input type="submit" value="上传文件" />
</form>
</body>
</html>
