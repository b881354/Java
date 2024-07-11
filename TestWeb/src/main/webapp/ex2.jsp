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
<s:form action="SturtsAction" method="post" theme="simple">
輸入數字:<s:textfield name="x"/><br>
<s:submit value="ok"/>
<s:reset value="重設"/>
</s:form>
</body>
</html>