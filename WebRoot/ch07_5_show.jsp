<%@ page language="java"  pageEncoding="GB2312"%>
<html>
  <head>
  <title>��¼��֤����</title>
 </head>
 <body>
    <%request.setCharacterEncoding("GB2312");%>
    <jsp:useBean id="uu" class="ch07_5.User"/>//<jsp:useBean>Ӧ��JavaBean�齨��
    <jsp:setProperty name="uu" property="*"/>//<jsp:setProperty>����JavaBean������ֵ��
    <% if(uu.yanzheng_user(uu.getXm(),uu.getMm())){
    %> 
    <%=uu.getXm()%> ��ϲ������¼�ɹ���<br> 
    <%   }   else 
    {%>
    <%=uu.getXm()%> ��¼ʧ�ܣ�<br> <%} %>
   </body>
   </html>
