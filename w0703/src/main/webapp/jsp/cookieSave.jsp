<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie</title>
	</head>
	<body>
		<%
			// create cookie
			Cookie cookie = new Cookie("c_id","aaa");
			Cookie cookie2 = new Cookie("c_pw","1111");
		
			// 쿠키 시간 설정
			cookie.setMaxAge(60*10); // 60s * 10m
			cookie2.setMaxAge(60*5); 
			
			// 로컬 저장
			response.addCookie(cookie);
			response.addCookie(cookie2);
			
			
		%>
		<h2>귀하의 쿠키를 사용하는 것에 대해 동의하셨습니다 ㅋㅋ</h2>
		<a href="cookieRead.jsp">페이지 이동</a>
	</body>
</html>