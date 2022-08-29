<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록</title>
<style>
table {
	text-align: center;
}
</style>
</head>
<body>
	<h1>회원 목록</h1>
	<c:forEach items="${members}" var="m">
		<table border="1">
			<tr>
				<th width="80px">아이디</th>
				<td width="100px">${m.member_id}</td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td>${m.member_password}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td>${m.member_name}</td>
			</tr>
			<tr>
				<th>권한</th>
				<td>${m.member_author}</td>
			</tr>
		</table>
		<br>
	</c:forEach>
</body>
</html>