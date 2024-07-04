<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>web</title>
	</head>
	<body>
		<%-- <h2>섹션 : <%=session.getAttribute("sessionId") %> </h2> --%>
		<h2>Main Page</h2>
		<h2>섹션 : ${sessionId}</h2>
		<c:if test="${sesionId == null}">
		<ul>
			<li><a href="login.jsp">로그인</a></li>
		</ul>
		</c:if>
		<c:if test="${sessionId != null}">
		<ul>
			<li><a href="Cp">게시판리스트</a></li>
			<li><a href="form.jsp">글쓰기</a></li>
			<li><a href="logout.jsp">로그아웃</a></li>
		</ul>
		</c:if>
		<%-- if(session.getAttribute("sessionId") == null){ --%>
		<%--}else{ --%>
		<%--} --%>
	</body>
</html>