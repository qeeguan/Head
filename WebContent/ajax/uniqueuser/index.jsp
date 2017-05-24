<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <link href="./css/warning.css" rel="stylesheet" type="text/css" /> -->
</head>
<body>
	<form action="" method="post" name="form1">
		用户名:<input type="text" name="user" size="32"> <input
			type="button" value="检测用户名" onclick="checkUser(form1.user)">
		密码：<input type="password" name="pwd1" size="35"><br>
		确认密码:<input type="password" name="pwd2" size="35"> <br>E-mail:<input
			type="text" name="email" size="45"><br> <input
			type="submit" value="注册">
	</form>
	<div id="div1"></div>
</body>

<script type="text/javascript">
	//初始化函数
	function createRequest(url) {
		http_request = false;
		if (window.XMLHttpRequest) {
			http_request = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			try {
				http_request = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {

			}

		}
		if (!http_request) {
			alert("不能创建XMLHttpRequest对象");
		}
		http_request.onreadystatechange = getResult;
		//alert("标记1")
		http_request.open("GET", url, true);
		//alert("标记2")
		http_request.send(null);
	}
	//回调函数
	function getResult() {
		//alert(http_request.readyState)
		//alert(http_request.status)
		if (http_request.readyState == 4) {
			if (http_request.status == 200) {
				//alert("走到这里了")
				document.getElementById("div1").innerHTML = http_request.responseText;
				//document.getElementById("toolTip").style.display = "block";
			}
		}
	}
	//检测用户是否为空
	function checkUser(user) {
		if (user.value == "") {
			alert("请输入用户名");
			user.focus();
			return;
		} else {
			createRequest("checkuser.jsp?user=" + user.value);
		}
	}
</script>
</html>