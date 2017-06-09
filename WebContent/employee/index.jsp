<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th width="30px">编号</th>
			<th width="30px">姓名</th>
			<th width="30px">性别</th>
			<th width="30px">地址</th>
			<th width="30px">备注</th>
		</tr>
		<c:forEach items="%${emplist }" var="list">
			<tr>
				<td>${list.id }</td>
				<td>${list.name }</td>
				<td>${list.sex }</td>
				<td>${list.address }</td>
				<td>${list.remark }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>