<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>대시보드</title>
    <link rel="stylesheet" href="/cz/css/style.css">
</head>
<body>
    <div class="wrapper">
            <img src="/cz/img/logo.png" alt="로고" />
        <div class="dashboard">
            <a href="/cz/list?case_of=매매" class="dashbtn">매매</a>
            <a href="/cz/list?case_of=전세" class="dashbtn">전세</a>
            <a href="/cz/list?case_of=월세" class="dashbtn">월세</a>
            <a href="/cz/list?case_of=임대" class="dashbtn">임대</a>
            <a href="/cz/mylist" class="dashbtn dashmybtn">내물건</a>
            <a href="/cz/upload" class="dashbtn dashmybtn">업로드</a>
        </div>
        
    </div>
</body>
</html>