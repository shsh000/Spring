<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Notice Form</title>
<style>
table {
	width: 800px;
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
}

table th {
	background-color: #333;
	color: #fff;
	padding: 10px;
	border-bottom: 1px solid #c6c9cc;
}
</style>
</head>
<body>
	<div align="center">
		<div>
			<h2>상세정보</h2>
		</div>
		<div>
			<table>
				<tr>
					<th width="500px">게시글번호</th>
					<td width="200px">${notices.noticeId}</td>
					<th width="100px">작성자</th>
					<td width="200px">${notices.noticeWriter}</td>
					<th width="100px">작성일자</th>
					<td width="200px">${notices.noticeDate}</td>
					<th width="100px">조회수</th>
					<td width="200px">${notices.noticeHit}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td colspan="7">${notices.noticeTitle}</td>
				</tr>
				<tr>
					<th>내용</th>
					<td colspan="7">
						<textarea rows="10px" cols="82px">${notices.noticeSubject}</textarea>
					</td>
				</tr>
				<tr>
					<th>첨부파일</th>
					<td colspan="7">${notices.noticeAttach}</td>
				</tr>
			</table>
		</div>
		<br>
		<div>
			<button type="button" onclick="location.href='noticeSelectList.do'">목록가기</button>
		</div>
	</div>

</body>
</html>