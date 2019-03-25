<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${ key } 리스트</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type="text/javascript" src="/cz/js/jquery.tablesorter.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="listheader">
            <a href="/cz/"><h2><span>${ key }</span> 리스트</h2></a>
            <input type="hidden" id="paramList" value="list" />
            <input type="hidden" id="paramGu" value="${ param.gu }" />
            <input type="hidden" id="paramKind_of" value="${ param.kind_of }" />
            <select name="kind_of" id="kind_of">
                <option value="전체">전체</option>
                <option value="빌딩">빌딩</option>
                <option value="상가">상가</option>
                <option value="상가주택">상가주택</option>
                <option value="주택">주택</option>
                <option value="아파트">아파트</option>
                <option value="빌라">빌라</option>
                <option value="모텔">모텔</option>
                <option value="토지">토지</option>
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
            
            <button id="orderPrice">가격 정렬</button>
            <button id="orderPyung">평수 정렬</button>
        </div>
        <div class="list">
            <table id="sortList" class="tablesorter">
            	<!-- 매매 -->
            	<c:if test="${ key == '매매' }">
            	<thead>
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>매매금</th>
                    <th>층수</th>
                </tr>
                </thead>
                
                <tbody>
                <c:forEach var="vo" items="${ list }">
                <tr>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.kind_of }
                    </td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" /></td>
                    <td>평</td>
                    <td>${ vo.sale_money_int*vo.sale_money_unit }</td>
                    <td><c:if test="${ vo.up_floor != 0 }">
                    ${ vo.up_floor }층</c:if></td>
                </tr>
                </c:forEach>
                </tbody>
                </c:if>
                
                
                <!-- 전세 -->
                <c:if test="${ key == '전세' }">
                <thead>
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>전세금</th>
                    <th>관리비</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="vo" items="${ list }">
                <tr>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.kind_of }
                    </td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" /></td>
                    <td>평</td>
                    <td>${ vo.jeonse_money_int*vo.jeonse_money_unit }</td>
                    <td><c:if test="${ vo.jeonse_seqr_money != 0 }">${ vo.jeonse_seqr_money }</c:if></td>
                </tr>
                </c:forEach>
                </tbody>
                </c:if>
                
                
                <!-- 월세,임대 -->
                <c:if test="${ key == '월세' || key == '임대' }">
                <thead>
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>보증금</th>
                    <th>월세</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="vo" items="${ list }">
                <tr>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.kind_of }
                    </td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" /></td>
                    <td>평</td>
                    <td>${ vo.rent_save_int*vo.rent_save_unit }</td>
                    <td>${ vo.rent_int*vo.rent_unit }</td>
                </tr>
                </c:forEach>
                </tbody>
                </c:if>
                
            </table>
        </div>
    </div>
    <script src="/cz/js/itemlist.js"></script>
</body>
</html>