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
	用户名：
	<s:property value="name" />
	密码：
	<s:property value="password" />
	性别：
	<s:if test="sex==0">女</s:if>
	<s:elseif test="sex==1">男</s:elseif>
	省份：
	<s:property value="province" />
	爱好：
	<s:property value="hobby" />
	描述：
	<s:property value="desc" />
</body>
</html>