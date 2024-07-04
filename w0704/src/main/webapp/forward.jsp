<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	<body>
		<h2>로그인</h2>
		<form action="doForward.jsp" method="post">
			<label>아이디</label>
			<input type="text" name="id"><br>
			<label>패스워드</label>
			<input type="password" name="pw"><br>
			<input type="checkbox" name="remember" id="remember" value="remember">
			<label for="remember">아이디 저장</label>
			<br>
			<input type="submit" value="로그인">
			
		</form>
	</body>
</html>