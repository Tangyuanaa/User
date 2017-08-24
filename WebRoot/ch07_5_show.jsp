<%@ page language="java"  pageEncoding="GB2312"%>
<html>
  <head>
  <title>登录验证界面</title>
 </head>
 <body>
    <%request.setCharacterEncoding("GB2312");%>
    <jsp:useBean id="uu" class="ch07_5.User"/>//<jsp:useBean>应用JavaBean组建。
    <jsp:setProperty name="uu" property="*"/>//<jsp:setProperty>设置JavaBean的属性值。
    <% if(uu.yanzheng_user(uu.getXm(),uu.getMm())){
    %> 
    <%=uu.getXm()%> 恭喜您，登录成功！<br> 
    <%   }   else 
    {%>
    <%=uu.getXm()%> 登录失败！<br> <%} %>
   </body>
   </html>
