<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeSelectList</title>
</head>
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
<body>
	<div><h1>게시판 목록</h1></div>
	<div>
		<table>
			<tr>
				<td width="70">
					<select id="key" name="key">
						<option value="1">제목</option>
						<option value="2">내용</option>
						<option value="3">작성자</option>
					</select>
				</td>
				<td width="100">
					<input type="text" id="val" name="val">
				</td>
				<td>
					<button type="button" onclick="searchCall()">검색</button>&nbsp;
					<button type="button" onclick="location.href='noticeForm.do'">글등록</button>
				</td>
			</tr>
		</table>
	</div><br>
	
	<!-- 넘어오는 컬럼명 그대로 대문자로 써야함 -->
	<div>
		<table>
			<thead>
				<tr>
					<th>게시글번호</th>
					<th>작성자</th>
					<th>제목</th>
					<th>첨부파일</th>
					<th>작성일자</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:if test="${empty notices}">
					<tr>
						<td colspan="6">게시글이 존재하지 않습니다.</td>
					</tr>
				</c:if>
				<c:forEach items="${notices}" var="N">
					<tr onclick="noticeCall(${N.NOTICE_ID})">
						<td>${N.NOTICE_ID}</td>
						<td>${N.NOTICE_WRITER}</td>
						<td>${N.NOTICE_TITLE}</td>
						<td>${N.NOTICE_ATTACH}</td>
						<td>${N.NOTICE_DATE}</td>
						<td>${N.NOTICE_HIT}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
	</div>

	<div>
		<form id="frm" method="post">
			<input type="hidden" id="noticeId" name="noticeId">
		</form>
	</div>

	<script type="text/javascript">
		function noticeCall(id) {
			frm.noticeId.value = id;
			frm.action = "noticeSelect.do";
			frm.submit();
			// console.log(frm.noticeId.value);
		}
		
		// ajax 검색처리
		/* function searchCall() {
			let key = document.getElementById("key").value;
			let val = document.getElementById("val").value;
			
			// 자바스크립트 p247 참고
			fetch("ajaxSearch.do", {
				method : "post",
				mode : "cors",
				cache : "no-cache",
				credentials : "same-origin",
				headers : {
					"Content-Type" : "application/x-www-form-urlencoded",
				},
				redirect : "follow",
				referrer : "no-referrer",
				body : "key=" + key + "&val=" + val
			})
			.then(response => response.json())
			.then(data => htmlView(data)); // html로 convert할 함수(html convert method) 만들어줘야함
		} */
		
		/* 
		// json 타입으로 값을 전달할 때(권장하는 방식)
		headers : {
			"Content-Type" : "application/json",
		},
		body : JSON.stringfy({"key" : key, "val" : val}) */
		
		
		
		// ajax 검색처리
		function searchCall() {
			let key = document.getElementById("key").value;
			let val = document.getElementById("val").value;
			
			// ajax 기본형
			$.ajax({
				url : "ajaxSearch.do",
				type : "post",
				data : {"key" : key, "val" : val},
				dataType : "json",
				success : function(response) {
					console.log(response);
					htmlView(response);
				},
				error : function(err) {
					console.log(err);
				}
			})
			
			function htmlView(data) {
				// html로 변환해서 원하는 위치에 출력하도록 구현
				
			}
		}
	</script>
</body>
</html>