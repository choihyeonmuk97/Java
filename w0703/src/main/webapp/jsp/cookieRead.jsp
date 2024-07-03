<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>cookie read</title>
	</head>
	<body>
		<%
			Cookie[] cookies = request.getCookies(); // 모든 쿠키 가져오기
			if(cookies != null){
				for(Cookie cookie:cookies){
					out.println("검색된 id : "+cookie.getValue()+"<br>");
					
					if(cookie.getName().equals("c_id")){
						String id = cookie.getValue();
						out.println("찾는 id : "+id+"<br>");
						cookie.setMaxAge(0);
						response.addCookie(cookie); // 쿠키 삭제
					}
				}
			}
		
		%>
		<a href="cookieDel.jsp">DELETE COOKIE</a>
	</body>
</html>