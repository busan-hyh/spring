<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User List</title>
</head>
<body>
	<table border="1">
		<c:forEach var="user" items="${ userList }">
		<tr>
			<td><a href="/hyh/userview?seq=${ user.seq }">${ user.name }</a></td>
			<td>${ user.pos }</td>
			<td>${ user.hp }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>