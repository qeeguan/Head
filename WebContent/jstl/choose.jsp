<%@ page language="java" contentType="text/html; charset=UTF-16"
	pageEncoding="UTF-16"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty param.user }">
			<form action="" method="post">
				用户名:<input type="text" name="user"> <br> <input
					type="submit" value="登录">
			</form>
		</c:when>
		<c:otherwise>
			${param.user }欢迎访问！
		</c:otherwise>
	</c:choose>
</body>
</html>