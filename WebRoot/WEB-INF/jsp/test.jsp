<%--
  Created by IntelliJ IDEA.
  User: lwg
  Date: 17/5/9
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <script type="text/javascript" src="http://www.ostools.net/js/jquery/jquery-1.7.2.js"></script>
  <script type="text/javascript">

    $.ajax({
      type:'post',
      url:'http://localhost:8080/SpringMVCTest/mvc1/showUsers',
      data: {
        "users": [
          {
            "id": "1234444",
            "name": "fasfafaf"
          },
          {
            "id": "1234444",
            "name": "fasfafaf"
          }
        ]
      },
      dataType:'json',//服务器返回的数据类型 可选XML ,Json jsonp script htmltext等
      success:function(msg){
      },
      error:function(){
        alert('error');
      }
    })
  </script>

</head>
<body>



<form action="hello">
  <%--用户编号：<input name="id"/>--%>
  <%--用户名：<input name="name"/>--%>
  <input type="submit" value="登陆">
</form>
<div>
  <button id="btn" onclick=ccc()>点击测试</button>
</div>


</body>
</html>
