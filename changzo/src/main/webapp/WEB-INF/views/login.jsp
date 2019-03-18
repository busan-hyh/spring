<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>로그인화면</title>
    <link rel="stylesheet" href="/cz/css/style.css">
</head>
<body>
    <div class="login_form">
        <form action="/cz/login" method="POST">
            <input type="text" name="uid" required placeholder="아이디" autocomplete="off" />
            <input type="password",  name="pass" required placeholder="비밀번호" />
            <input type="submit" value="로그인" />
        </form>
    </div>
</body>
</html>