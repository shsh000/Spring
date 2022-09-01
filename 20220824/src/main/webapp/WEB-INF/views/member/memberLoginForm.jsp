<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
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
}

table th {
	background-color: #333;
	color: #fff;
	padding: 10px;
	width: 200px;
	border-bottom: 1px solid #c6c9cc;
}
</style>
<script src="resources/js/jquery-3.6.0.min.js"></script>
</head>
<body>
	<div align="center">
		<div><h1>로그인</h1></div>
		<div>
			<form id="frm" action="memberLogin.do" method="post">
				<div>
					<table border="1">
						<tr>
							<th width="100px">아이디</th>
							<td width="200px">
								<input type="text" id="member_id" name="member_id">
							</td>
						</tr>
						<tr>
							<th>패스워드</th>
							<td>
								<input type="password" id="member_password" name="member_password">
							</td>
						</tr>
					</table>
				</div><br>
				<input type="submit" value="로그인">&nbsp;&nbsp;
				<input type="reset" value="취소">
			</form>
		</div>
	</div>
</body>
</html>