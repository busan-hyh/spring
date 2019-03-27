<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                <td>
                <c:if test="${ view.ing == 1 }">매물</c:if>
                <c:if test="${ view.ing == 2 }">진행</c:if>
                <c:if test="${ view.ing == 3 }">완료</c:if>
                </td>
            </tr>
            <tr>
                <td>날짜</td>
                <td><fmt:formatDate value="${ view.rdate }" pattern="yyyy-MM-dd"/></td>
            </tr>
            <tr>
                <td>유형</td>
                <td>${ view.case_of }</td>
            </tr>
            <tr>
                <td>종류</td>
                <td>${ view.kind_of }</td>
            </tr>
            <tr>
                <td>주소</td>
                <td>${ view.gu } ${ view.dong }</td>
            </tr>
            <!-- 본인인 경우 -->
            <c:if test="${ uid == view.uid || grade == 2 }">
            <tr class="mydetail_view">
                <td>상세주소</td>
                <td>${ view.detail_addr }</td>
            </tr>
            </c:if>
            <!-- 본인인 경우 끝 -->
            <tr>
                <td>크기</td>
                <td><span class="sMeter0">${ view.scale_meter }</span><span></span></td> 
            </tr>
            <tr>
                <td>메모</td>
                <td>${ view.memo }</td>
            </tr>
            <!-- 분기 시작 -->
            <!-- 매매인 경우 -->
            <c:if test="${ view.case_of == '매매' }">
            <tr>
                <td>매매가격</td>
                <td>${ view.sale_money_int*view.sale_money_unit }만원</td>
            </tr>
            <tr>
                <td>전세금</td>
                <td><c:if test="${ view.sale_jeonse_money_int != 0 }">
                ${ view.sale_jeonse_money_int*view.sale_jeonse_money_unit }만원</c:if></td>
            </tr>
            <tr>
                <td>대출금</td>
                <td><c:if test="${ view.sale_rend_money != 0 }">
                ${ view.sale_rend_money }만원</c:if></td>
            </tr>
            <tr>
                <td>층수</td>
                <td><c:if test="${ view.up_floor != 0 }">
                	지상${ view.up_floor }층
                	</c:if>
                	<c:if test="${ view.down_floor != 0 }">
                	 / 지하${ view.down_floor }층
                	</c:if></td>
            </tr>
            <tr>
                <td>토지면적</td>
                <td><c:if test="${ view.scale_toji != 0 }">
                <span class="sMeter1">${ view.scale_toji }</span><span></span></c:if></td> 
            </tr>
            <tr>
                <td>연면적</td>
                <td><c:if test="${ view.scale_yeon != 0 }">
                <span class="sMeter2">${ view.scale_yeon }</span><span></span></c:if></td>
            </tr>
            <tr>
                <td>건축면적</td>
                <td><c:if test="${ view.scale_gun != 0 }">
                <span class="sMeter3">${ view.scale_gun }</span><span></span></c:if></td>
            </tr>
            </c:if>
            <!-- 전세인 경우 -->
            <c:if test="${ view.case_of == '전세' }">
            <tr>
                <td>전세금</td>
                <td>${ view.jeonse_money_int*view.jeonse_money_unit }만원</td>
            </tr>
            <tr>
                <td>관리비</td>
                <td><c:if test="${ view.jeonse_seqr_money != 0 }">
                ${ view.jeonse_seqr_money }만원</c:if></td>
            </tr>
            <tr>
                <td>대출금</td>
                <td><c:if test="${ view.jeonse_rend_money != 0 }">
                ${ view.jeonse_rend_money }만원</c:if></td>
            </tr>
            </c:if>
            <c:if test="${ view.case_of == '월세' || view.case_of == '임대' }">
            <!-- 월세인 경우 -->
            <tr>
                <td>보증금</td>
                <td>${ view.rent_save_int*view.rent_save_unit }만원</td>
            </tr>
            <tr>
                <td>월세</td>
                <td>${ view.rent_int*view.rent_unit }만원</td>
            </tr>
            <tr>
                <td>관리비</td>
                <td><c:if test="${ view.rent_seqr_money != 0 }">
                ${ view.rent_seqr_money }만원</c:if></td>
            </tr>
            <tr>
                <td>대출금</td>
                <td><c:if test="${ view.rent_rend_money != 0 }">
                ${ view.rent_rend_money }</c:if></td>
            </tr>
            </c:if>
            <!-- 분기 끝 -->
            <tr>
                <td>주차</td>
                <td><c:if test="${ view.pkl == 0 }">없음</c:if>
                <c:if test="${ view.pkl == 1 }">있음</c:if>
                </td>
            </tr>
            <tr>
                <td>엘리베이터</td>
                <td><c:if test="${ view.elb == 0 }">없음</c:if>
                <c:if test="${ view.elb == 1 }">있음</c:if></td>
            </tr>
            <tr>
                <td>담당자</td>
                <td><a href="tel:${ view.mng1_hp }">${ view.mng1_name } ${ view.mng1_hp }</a></td>
            </tr>
            <c:if test="${ view.mng2_kind != 0 }">
            <tr>
                <td>담당자2</td>
                <td><a href="tel:${ view.mng2_hp }">${ view.mng2_name } ${ view.mng2_hp }</a></td>
            </tr>
            </c:if>
            <!-- 본인인 경우 -->
            <c:if test="${ uid == view.uid || grade == 2 }">
            <tr class="mydetail_view">
                <td><c:if test="${ view.slr1_kind == 2 }">명의자</c:if>
                <c:if test="${ view.slr1_kind == 3 }">관리자</c:if></td>
                <td>${ view.slr1_name } <a href="tel:${ view.slr1_hp }">${ view.slr1_hp }</a></td>
            </tr>
            <c:if test="${ view.slr2_kind != 0 }">
            <tr class="mydetail_view">
                <td><c:if test="${ view.slr2_kind == 2 }">명의자</c:if>
                <c:if test="${ view.slr2_kind == 3 }">관리자</c:if></td>
                <td>${ view.slr2_name } <a href="tel:${ view.slr2_hp }">${ view.slr2_hp }</a></td>
            </tr>
            </c:if>
            </c:if>
            <!-- 본인인 경우 끝 -->
        </table>
        <button id="uploadSubmit" onclick="history.back(-1);">뒤로가기</button>
        <!-- 본인인 경우 -->
        <c:if test="${ uid == view.uid }">
        <a href="/cz/modify?seq=${ view.seq }"><input id="uploadCancle" type="button" value="수정하기"></a>
        </c:if>
        <!-- 본인인 경우 끝 -->
    </div>
    </div>
    <script src="/cz/js/itemview.js"></script>
</body>
</html>