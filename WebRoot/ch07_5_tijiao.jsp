/*处理流程：首先通过提交页面（tijiao.jsp）提交登录信息；然后进入验证结果显示页面（show.jsp），该页面获得两个登录信息的值
，并创建User JavaBean对象。该对象调用User中的boolean yanzheng_user(),实现验证，根据返回的逻辑值判定，“true”表示已经注册并
输入正确的用户名和密码，则在网页上显示登陆成功，否则登录失败。*/
<%@ page language="java"  pageEncoding="GB2312"%>
<html>
  <head>
    <title>用户登录提交页面</title>
  </head>
  <body>
    <form action="ch07_5_show.jsp" method="post">
     用户名：      <input type="text" name="xm"><br><br>
    用户密码： <input type="password" name="mm"><br><br>
    <input type="submit" value="登录">
    </form>
  </body>
</html>