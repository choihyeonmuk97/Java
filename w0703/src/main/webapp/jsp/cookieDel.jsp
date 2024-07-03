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
			Cookie[] cookies = request.getCookies();
			if(cookies != null){
				for(Cookie cookie : cookies){
					out.println("찾은 쿠키 : "+cookie.getValue()+"<br>");
					
				}
			}
		
		%>
		
		<a href="cookieSave.jsp">쿠키 저장으로 이동</a>
		
	</body>
</html>