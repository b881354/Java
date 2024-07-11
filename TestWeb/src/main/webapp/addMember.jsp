<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %> <!-- here -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="AddMemberAction" method="post" theme="simple">
姓名:<s:textfield name="name" /><br>
帳號:<s:textfield name="username" /><br>
密碼:<s:password name="password" /><br>
地址:<s:textfield name="address" /><br>
電話:<s:textfield name="phone" /><br>
<s:submit value="ok" />
</s:form>
</body>
</html>