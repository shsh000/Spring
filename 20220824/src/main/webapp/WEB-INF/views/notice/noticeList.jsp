<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notice List</title>
<style>
table {
	text-align:center;
}

tr {
	height:30px;
}
</style>
</head>
<body>
	<h1>게시판 목록</h1>
	<a href="noticeForm.do">글 등록</a>
	<c:forEach items="${notice}" var="n">
			<table border="1">
				<tr>
					<th width="100">게시글번호</th>
					<td width="70">${n.notice_id}</td>
					<th width="100">작성자</th>
					<td width="70">${n.notice_writer}</td>
					<th width="80">날짜</th>
					<td width="100">${n.notice_date}</td>
					<th width="80">조회수</th>
					<td width="100">${n.notice_hit}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="7">${n.notice_title}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="7">${n.notice_subject}</td>
				</tr>
				<tr>
					<th>첨부파일</th>
					<td colspan="4">${n.notice_attach}</td>
					<th>첨부파일위치</th>
					<td colspan="3">${n.notice_attach_dir}</td>
				</tr>
			</table><br>
	</c:forEach>
</body>
</html>