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
	<s:form action="FormAction!register" method="post">
		<s:textarea name="name" label="用户名" required="true"
			requiredposition="left">
		</s:textarea>
		<s:password name="password" label="密码" required="true"
			requiredposition="left">
		</s:password>
		<s:radio list="#{1:'男',0:'女'}" name="sex" label="性别" required="true"
			requiredposition="left"></s:radio>
		<s:select list="{'请选择省份','辽宁','北京','山东','广东'}" label="省份"
			name="province"></s:select>
		<s:checkboxlist list="{'足球','篮球','乒乓球','王者荣耀'}" name="hobby"
			label="爱好"></s:checkboxlist>
		<s:textarea name="desc" label="描述" cols="30" rows="5"></s:textarea>
		<s:submit value="提交"></s:submit>
		<s:reset value="重置"></s:reset>
	</s:form>
</body>
</html>