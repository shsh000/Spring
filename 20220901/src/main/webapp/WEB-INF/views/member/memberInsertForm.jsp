<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberInsertForm</title>
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
</head>
<body>
<div align="center">
	<h1>회원가입</h1>
	<div>
		<form id="frm" action="memberInsert.do" method="post">
			<div>
				<table border="1">
					<tr>
						<th>아이디</th>
						<td>
							<input type="text" id="memberId" name="memberId">
						</td>
					</tr>
					<tr>
						<th>비밀번호</th>
						<td>
							<input type="password" id="memberPassword" name="memberPassword">
						</td>
					</tr>
					<tr>
						<th>이름</th>
						<td>
							<input type="text" id="memberName" name="memberName">
						</td>
					</tr>
				</table>
			</div><br>
			
			<div>
				<input type="submit" value="등록">&nbsp;&nbsp;
				<input type="button" value="취소" onclick="location.href='memberSelectList.do'">&nbsp;&nbsp;
				<input type="reset" value="초기화">
			</div>
			
		</form>
	</div>
</div>
</body>
</html>