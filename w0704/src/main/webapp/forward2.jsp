<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>forward</title>
	</head>
	<body>
		<table>
			<tr>
				<th>제목</th>
				<th>내용</th>
			</tr>
			<tr>
				<td>아이디</td>
				<td>${param.id}</td>
			</tr>
			<tr>
				<td>패스워드</td>
				<td>${param.pw}</td>
			</tr>
		</table>
		
	</body>
</html>