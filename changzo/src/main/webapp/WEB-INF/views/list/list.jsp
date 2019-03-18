<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title><!-- 매매/전세/월세/임대 --> 리스트</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="listheader">
            <h2><!-- 매매/전세/월세/임대 --> 리스트</h2>
            <select name="gu" id="gu" onchange="changeDong(this)">
                <option value="전체구">전체 구</option>
                <option value="중구">중구</option>
                <option value="서구">서구</option>
                <option value="동구">동구</option>
                <option value="영도구">영도구</option>
                <option value="부산진구">부산진구</option>
                <option value="동래구">동래구</option>
                <option value="남구">남구</option>
                <option value="북구">북구</option>
                <option value="해운대구">해운대구</option>
                <option value="사하구">사하구</option>
                <option value="금정구">금정구</option>
                <option value="강서구">강서구</option>
                <option value="연재구">연재구</option>
                <option value="수영구">수영구</option>
                <option value="사상구">사상구</option>
                <option value="기장군">기장군</option>
            </select>
            <select name="dong" id="dong">
                <option value="전체동">전체 동</option>
            </select>
            <button value="orderPrice">가격 정렬</button>
            <button value="orderPyung">평수 정렬</button>
        </div>
        <div class="list">
            <table>
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <!-- 분기시작 -->
                    <!-- 매매 -->
                    <th>층수</th>
                    <th>매매금</th>
                    <!-- 전세 -->
                    <th>전세금</th>
                    <th>관리비</th>
                    <!-- 월세,임대 -->
                    <th>보증금</th>
                    <th>월세</th>
                    <!-- 분기끝 -->
                </tr>
                <tr>
                    <td><input type="hidden" name="seq" value="2">
                        <input type="hidden" name="case" value="sale">
                        아파트</td>
                    <td>남부민동</td>
                    <td>138.84㎡</td>
                    <td>42평</td>
                    <td>2층</td>
                    <td>3억</td>
                </tr>
                <tr>
                    <td><input type="hidden" name="seq" value="3">
                        <input type="hidden" name="case" value="sale">
                        상가</td>
                    <td>토성동</td>
                    <td>211.57㎡</td>
                    <td>64평</td>
                    <td>3층</td>
                    <td>6억7천</td>
                </tr>
            </table>
        </div>
    </div>
    <script src="/cz/js/dongSelector.js"></script>
    <script src="/cz/js/itemview.js"></script>
</body>
</html>