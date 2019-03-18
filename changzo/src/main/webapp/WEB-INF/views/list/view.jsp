<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>내물건 상세</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
    <div class="view">
        <table>
            <tr>
                <td>진행상황</td>
                <td>매물</td>
            </tr>
            <tr>
                <td>날짜</td>
                <td>2019-03-17</td>
            </tr>
            <tr>
                <td>유형</td>
                <td>매매</td>
            </tr>
            <tr>
                <td>종류</td>
                <td>아파트</td>
            </tr>
            <tr>
                <td>주소</td>
                <td>서구 남부민동</td>
            </tr>
            <!-- 본인인 경우 시작 -->
            <tr>
                <td>상세주소</td>
                <td>자갈치로 2</td>
            </tr>
            <!-- 본인인 경우 끝 -->
            <tr>
                <td>크기</td>
                <td><span class="sMeter0">125</span><span></span></td> 
            </tr>
            <tr>
                <td>메모</td>
                <td>방3 화2 즉시입주가능</td>
            </tr>
            <!-- 분기 시작 -->
            <!-- 매매인 경우 -->
            <tr>
                <td>매매가격</td>
                <td>2억3천</td>
            </tr>
            <tr>
                <td>전세금</td>
                <td></td>
            </tr>
            <tr>
                <td>대출금</td>
                <td></td>
            </tr>
            <tr>
                <td>층수</td>
                <td></td>
            </tr>
            <tr>
                <td>토지면적</td>
                <td><span class="sMeter1">12</span><span></span></td> 
            </tr>
            <tr>
                <td>연면적</td>
                <td><span class="sMeter2">120</span><span></span></td>
            </tr>
            <tr>
                <td>건축면적</td>
                <td><span class="sMeter3">1200</span><span></span></td>
            </tr>
            <!-- 전세인 경우 -->
            <tr>
                <td>전세금</td>
                <td>2억</td>
            </tr>
            <tr>
                <td>관리비</td>
                <td>12만원</td>
            </tr>
            <tr>
                <td>대출금</td>
                <td></td>
            </tr>
            <!-- 월세인 경우 -->
            <tr>
                <td>보증금</td>
                <td>2억</td>
            </tr>
            <tr>
                <td>월세</td>
                <td>20만원</td>
            </tr>
            <tr>
                <td>관리비</td>
                <td>12만원</td>
            </tr>
            <tr>
                <td>대출금</td>
                <td></td>
            </tr>
            <!-- 분기 끝 -->
            <tr>
                <td>주차</td>
                <td>가능</td>
            </tr>
            <tr>
                <td>엘리베이터</td>
                <td>유</td>
            </tr>
            <tr>
                <td>담당자</td>
                <td>김슬기 010-4237-3793</td>
            </tr>
            <!-- 본인인 경우 시작 -->
            <tr>
                <td>명의자</td>
                <td>이지선 010-3881-1579</td>
            </tr>
            <!-- 본인인 경우 끝 -->
        </table>
        <button onclick="history.back(-1);">뒤로가기</button>
        <!-- 본인인 경우 시작 -->
        <a href="#"><input type="button" value="수정하기"></a>
        <!-- 본인인 경우 끝 -->
    </div>
    </div>
    <script src="/cz/js/itemview.js"></script>
</body>
</html>