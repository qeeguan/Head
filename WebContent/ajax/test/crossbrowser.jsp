<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="javascript:checkBrowser()">调用函数</a>
</body>
<script type="text/javascript">
	function checkBrowser() {
		http_request = false;
		if (window.XMLHttpRequest) {
			http_request = new XMLHttpRequest();
		} else if (window.ActiveXObject) {
			try {
				http_request = new ActiveXObject(Msxml2.XMLHTTP);
			} catch (e) {
				try {
					http_request = new ActiveXObject(Microsoft.XMLHTTP);
				} catch (e) {
				}
			}
		}
		if (http_request == null) {
			alert("不能创建XMLHttpRequest对象");
			return false;
		} else {
			alert("创建XMLHttpRequest对象成功");
			return true;
		}
	}
</script>
</html>