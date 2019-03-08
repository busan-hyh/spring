<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Regist</title>
</head>
<body>
	<h1>직원출력</h1>
	<table border="1">
		<tr>
			<td>아이디</td><!-- userVO도 어노테이션네임이므로 소문자로 시작 -->
			<td>${ userVO.uid }</td>
		</tr>
		<tr>
			<td>이름</td>
			<td>${ userVO.name }</td>
		</tr>
		<tr>
			<td>휴대폰</td>
			<td>${ userVO.hp }</td>
		</tr>
		<tr>
			<td>주소</td>
			<td>${ userVO.addr }</td>
		</tr>
		<tr>
			<td>직급</td>
			<td>${ userVO.pos }</td>
		</tr>
		<tr>
			<td>부서</td>
			<td>${ userVO.dep }</td>
		</tr>
	</table>
</body>
</html>