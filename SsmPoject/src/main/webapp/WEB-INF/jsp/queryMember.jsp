<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="service.impl.MemberServiceImpl"%>
    
  <%
  MemberServiceImpl msi=new MemberServiceImpl();
  
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table width=400 align=center border=6>
	<tr>
		<td>編號<td>姓名<td>帳號<td>密碼<td>地址<td>電話
		<%
		out.println(msi.selectAll());
		%>
	<tr>
		<td colspan=6 align=center>
		<a href="index.jsp">回首頁</a>

</table>

</body>
</html>