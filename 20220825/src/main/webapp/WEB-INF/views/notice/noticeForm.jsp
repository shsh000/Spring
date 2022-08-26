<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
}

table th {
    background-color: #333;
    color: #fff;
    padding: 10px;
}
</style>
</head>
<body>
	<div align="center">
		<div><h1>공지사항 등록</h1></div>
		<div>
			<form id="frm" action="noticeInsert.do" method="post" enctype="multipart/form-data">
				<div>
					<table border="1">
						<tr>
							<th width="100px">작성자</th>
							<td width="200px">		<!-- vo 객체 이름과 동일 -->
								<input type="text" id="noticeWriter" name="noticeWriter">
							</td>
							<th width="100px">작성일자</th>
							<td width="200px">
								<input type="date" id="noticeDate" name="noticeDate">
							</td>
						</tr>
						<tr>
							<th>제목</th>
							<td colspan="3">
								<input type="text" id="noticeTitle" name="noticeTitle" size="80px">
							</td>
						</tr>
						<tr>
							<th>내용</th>
							<td colspan="3">
								<textarea rows="10px" cols="82px" id="noticeSubject" name="noticeSubject"></textarea>
							</td>
						</tr>
						<tr>
							<th>첨부파일</th>
							<td colspan="3">
								<input type="file" id="file" name="file">
							</td>
						</tr>
					</table>
				</div><br>
				<input type="submit" value="등록">&nbsp;&nbsp;
				<input type="button" value="취소" onclick="location.href='noticeSelectList.do'">&nbsp;&nbsp;
				<input type="reset" value="초기화">
			</form>
		</div>
	</div>
</body>
</html>