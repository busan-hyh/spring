<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>내 리스트</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <link rel="shortcut icon" type="image/x-icon" href="/cz/img/favi.ico" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/cz/js/jquery.tablesorter.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="listheader">
            <a href="/cz/"><h2>내 리스트</h2></a>
            <input type="hidden" id="paramList" value="mylist" />
            <input type="hidden" id="paramGu" value="${ param.gu }" />
            <input type="hidden" id="paramCase_of" value="${ param.case_of }" />
            <input type="hidden" id="paramKind_of" value="${ param.kind_of }" />
            <select name="case" id="case_of">
                <option value="전체">전체</option>
                <option value="매매">매매</option>
                <option value="전세">전세</option>
                <option value="월세">월세</option>
                <option value="임대">임대</option>
            </select>
            <select name="kind_of" id="kind_of">
                <option value="전체">전체</option>
                <option value="빌딩">빌딩</option>
                <option value="상가">상가</option>
                <option value="상가주택">상가주택</option>
                <option value="주택">주택</option>
                <option value="아파트">아파트</option>
                <option value="빌라">빌라</option>
                <option value="숙박업소">숙박업소</option>
                <option value="토지">토지</option>
                <option value="기타">기타</option>
            </select>
            <select name="gu" id="gu">
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
            <a href="/cz/mylist"><input class="veiwAll" type="button" value="전체"></a>
        </div>
        <div class="mylist">
            <table id="sortList" class="tablesorter">
            	<thead>
                <tr>
                    <th>유형</th>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>가격</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="vo" items="${ mylist }">
                <tr<c:if test="${ vo.ing == 3 }"> class="done"</c:if>>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.case_of }
                    </td>
                    <td>${ vo.kind_of }</td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" /></td>
                    <td>평</td>
                    <c:if test="${ vo.case_of == '매매' }"><td>${ vo.sale_money_int*vo.sale_money_unit }</td></c:if>
                    <c:if test="${ vo.case_of == '전세' }"><td>${ vo.jeonse_money_int*vo.jeonse_money_unit }</td></c:if>
                    <c:if test="${ vo.case_of == '월세' || vo.case_of == '임대' }"><td>${ vo.rent_int*vo.rent_unit }</td></c:if>
                </tr>
                </c:forEach>
                </tbody>
                
            </table>
        </div>
        <div>
        	<c:if test="${ grade == 2 }">
            	<a href="/cz/register"><input id="uploadCancle" type="button" value="회원가입"></a>
            </c:if>
            <c:if test="${ uid != null }">
            	<a href="/cz/regimodi"><input id="uploadCancle" type="button" value="정보수정"></a>
            	<a href="/cz/logout"><input id="uploadSubmit" type="button" value="로그아웃"></a>
            </c:if>
        </div>
    </div>
    <script src="/cz/js/dongSelector.js"></script>
    <script src="/cz/js/itemlist.js"></script>
</body>
</html>