<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${ list.key } 리스트</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="listheader">
            <a href="/cz/"><h2>${ list.key } 리스트</h2></a>
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
            	<!-- 매매 -->
            	<c:if test="${ list.key == '매매' }">
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>매매금</th>
                    <th>층수</th>
                </tr>
                <c:forEach var="vo" items="${ list.map }">
                <tr>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.kind_of }
                    </td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_meter }" integerOnly="true" />㎡</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" />평</td>
                    <td>${ vo.sale_money_int*vo.sale_money_unit }</td>
                    <td><c:if test="${ vo.up_floor != 0 }">
                    ${ vo.up_floor }층</c:if></td>
                </tr>
                </c:forEach>
                </c:if>
                
                <!-- 전세 -->
                <c:if test="${ list.key == '전세' }">
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>전세금</th>
                    <th>관리비</th>
                </tr>
                <c:forEach var="vo" items="${ list.map }">
                <tr>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.kind_of }
                    </td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_meter }" integerOnly="true" />㎡</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" />평</td>
                    <td>${ vo.jeonse_money_int*vo.jeonse_money_unit }</td>
                    <td>${ vo.jeonse_seqr_money }</td>
                </tr>
                </c:forEach>
                </c:if>
                
                
                <!-- 월세,임대 -->
                <c:if test="${ list.key == '월세' || list.key == '임대' }">
                <tr>
                    <th>종류</th>
                    <th>주소</th>
                    <th colspan="2">크기</th>
                    <th>보증금</th>
                    <th>월세</th>
                </tr>
                <c:forEach var="vo" items="${ list.map }">
                <tr>
                    <td><input type="hidden" name="seq" value="${ vo.seq }">${ vo.kind_of }
                    </td>
                    <td>${ vo.gu } ${ vo.dong }</td>
                    <td><fmt:parseNumber value="${ vo.scale_meter }" integerOnly="true" />㎡</td>
                    <td><fmt:parseNumber value="${ vo.scale_pyung }" integerOnly="true" />평</td>
                    <td>${ vo.rent_save_int*vo.rent_save_unit }</td>
                    <td>${ vo.rent_int*vo.rent_unit }</td>
                </tr>
                </c:forEach>
                </c:if>
                
            </table>
        </div>
    </div>
    <script src="/cz/js/dongSelector.js"></script>
    <script src="/cz/js/itemview.js"></script>
</body>
</html>