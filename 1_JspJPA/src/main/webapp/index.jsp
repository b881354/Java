<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>會員登入</h3>
<s:form action="LoginAction" method="post" theme="simple">
	帳號:<s:textfield name="username"/><br>
	密碼:<s:password name="password"/><br>
	<s:submit value="ok"/>
	<a href="AddMember.jsp">註冊</a>
</s:form>
</body>
</html>