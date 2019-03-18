<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>내 리스트</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="listheader">
            <h2>내 리스트</h2>
            <select name="case" id="case">
                <option>전체</option>
                <option value="매매">매매</option>
                <option value="전세">전세</option>
                <option value="월세">월세</option>
                <option value="임대">임대</option>
            </select>
            <select name="kindOf" id="kindOf">
                <option>전체</option>
                <option value="빌딩">빌딩</option>
                <option value="상가">상가</option>
                <option value="상가주택">상가주택</option>
                <option value="주택">주택</option>
                <option value="아파트">아파트</option>
                <option value="빌라">빌라</option>
                <option value="토지">토지</option>
            </select>
            <select name="gu" id="gu" onchange="changeDong(this)">
                <option>전체 구</option>
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
                <option>전체 동</option>
            </select>
            <a href="#"><input class="veiwAll" type="button" value="전체"></a>
        </div>
        <div class="mylist">
            <table>
                <tr>
                    <th>유형</th>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>가격</th>
                </tr>
                <tr>
                    <td><input type="hidden" name="seq" value="2">
                        <input type="hidden" name="case" value="sale">
                        매매</td>
                    <td>아파트</td>
                    <td>남부민동</td>
                    <td>138.84㎡</td>
                    <td>42평</td>
                    <td>3억</td>
                </tr>
                <tr>
                    <td><input type="hidden" name="seq" value="3">
                        <input type="hidden" name="case" value="sale">
                        임대</td>
                    <td>상가</td>
                    <td>토성동</td>
                    <td>211.57㎡</td>
                    <td>64평</td>
                    <td>3백</td>
                </tr>
            </table>
        </div>
    </div>
    <script src="/cz/js/dongSelector.js"></script>
    <script src="/cz/js/itemview.js"></script>
</body>
</html>