<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>학생 성적 입력</title>
	</head>
	<body>
		<!-- 쿠키 -->
		<!-- co.jsp						doco.jsp
			이름,국,영,수 / 이름저장쳌박 -> 이름,국,영,수,합,평 입력창 이동
			체크박스, 전송버튼				입력창 버튼 클릭하면 이동
			이름은 저장되어 따로 입력하지 않아도 되도록
		 -->
		 <h2>학생 성적 입력</h2>
		 <form action="doco.jsp" method="post">
			 <label>이름</label>
			 <input type="text" name="name"><br>
			 <label>국어</label>
			 <input type="text" name="kor"><br>
			 <label>영어</label>
			 <input type="text" name="eng"><br>
			 <label>수학</label>
			 <input type="text" name="math"><br>
			 <input type="checkbox" name="remember" id="remember" value="remember">
			 <label for="remember">이름 저장</label>
			 <br>
			 <input type="submit" value="학생성적조회">
			 
	</body>
</html>