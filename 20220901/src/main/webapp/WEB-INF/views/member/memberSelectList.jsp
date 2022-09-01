<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멤버 목록</title>
<style>
h1 {
	text-align: center;
}

table {
	text-align: center;
	border: 1px solid #fff;
	border-spacing: 1px;
	font-family: 'Cairo', sans-serif;
	margin: auto;
}

table td {
	padding: 10px;
	background-color: #eee;
	border-bottom: 1px solid #c6c9cc;
	border-right: 1px solid #c6c9cc;
	width: 200px;
}

table th {
	background-color: #333;
	color: #fff;
	padding: 10px;
	width: 130px;
	border-bottom: 1px solid #c6c9cc;
	border-left: 1px solid #c6c9cc;
}
</style>
<script src="resources/js/jquery-3.6.0.min.js"></script>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div align="center">
	<h1>Member List</h1>
		<table border="1">
			<tr>
				<th width="80px">아이디</th>
				<th width="120px">비밀번호</th>
				<th width="80px">이름</th>
				<th width="80px">권한</th>
			</tr>
			<c:if test="${empty members}">
				<tr>
					<td colspan="4">회원이 존재하지 않습니다.</td>
				</tr>
			</c:if>
			<c:forEach items="${members}" var="m">
			<tr>
				<td>${m.memberId}</td>
				<td>${m.memberPassword}</td>
				<td>${m.memberName}</td>
				<td>${m.memberAuthor}</td>
			</tr>
			</c:forEach>
		</table><br>
		
	<div>
		<button type="submit" class="btn btn-secondary" onclick="location.href='memberInsertForm.do'">등록</button>&nbsp;&nbsp;
		<button type="button" class="btn btn-secondary" onclick="location.href='home.do'">홈으로가기</button>
	</div>
</div>
</body>
</html>