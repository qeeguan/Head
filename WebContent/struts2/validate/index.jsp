<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="ValidateAction" method="post">
		<s:textfield name="name" label="姓名" required="true"></s:textfield>
		<br>
		<s:password name="password" label="密码" required="true"></s:password>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>