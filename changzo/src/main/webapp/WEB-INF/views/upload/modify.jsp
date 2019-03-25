<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>수정하기</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="uploadrCard">
            <form action="/cz/modify?seq=${ view.seq }" method="POST">
                <table id="main">
                    <tr>
                        <td>진행상황</td>
                        <td colspan="2"><select name="ing" id="ing">
                            <option value="1">매물</option>
                            <option value="2">진행중</option>
                            <option value="3">완료</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>유형<input type="hidden" value="${ view.case_of }"></td>
                        <td colspan="2"><select name="case_of" id="case_of">
                            <option value="매매">매매</option>
                            <option value="전세">전세</option>
                            <option value="월세">월세</option>
                            <option value="임대">임대</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>종류</td>
                        <td colspan="2"><select name="kind_of" id="kind_of">
                            <option value="빌딩">빌딩</option>
                            <option value="상가">상가</option>
                            <option value="상가주택">상가주택</option>
                            <option value="주택">주택</option>
                            <option value="아파트">아파트</option>
                            <option value="빌라">빌라</option>
                            <option value="모텔">모텔</option>
                            <option value="토지">토지</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>주소<input type="hidden" value="${ view.gu }">
                        <input type="hidden" value="${ view.dong }"></td>
                        <td><select name="gu" id="gu" onchange="changeDong(this)" required>
                            <option value="">구 이름</option>
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
                        </select></td>
                        <td><select name="dong" id="dong" required>
                            <option>동 이름</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>상세주소</td>
                        <td colspan="2"><input type="text" name="detail_addr" value="${ view.detail_addr }" required></td>
                    </tr>
                    <tr>
                        <td>크기</td>
                        <td colspan="2"><input type="text" class="mSMeter" name="scale_meter" value="${ view.scale_meter }" required>㎡ = 
                        <input type="text" class="mPyung" name="scale_pyung" value="${ view.scale_pyung }" required>평</td>
                    </tr>
                    <tr>
                        <td>메모</td>
                        <td colspan="2"><input type="text" name="memo" value="${ view.memo }"></td>
                    </tr>
                </table>
                <table id="forSale">
                    <tr>
                        <td>매매가격</td>
                        <td colspan="2"><input type="text" name="sale_money_int" value="${ view.sale_money_int }">
                            <select name="sale_money_unit" id="sale_money_unit">
                                <option value="10000">억원</option>
                                <option value="1000">천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>전세금</td>
                        <td colspan="2"><input type="text" name="sale_jeonse_money_int" value="${ view.sale_jeonse_money_int }">
                            <select name="sale_jeonse_money_unit" id="sale_jeonse_money_unit">
                                <option value="10000">억원</option>
                                <option value="1000">천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td colspan="2"><input type="text" name="sale_rend_money" value="${ view.sale_rend_money }">만원</td>
                    </tr>
                    <tr>
                        <td>층수</td>
                        <td>지상<input type="text" name="up_floor" value="${ view.up_floor }">층</td>
                        <td>지하<input type="text" name="down_floor" value="${ view.down_floor }">층</td>
                    </tr>
                    <tr>
                        <td>토지면적</td>
                        <td colspan="2"><input type="text" class="sMeter" name="scale_toji" value="${ view.scale_toji }">㎡ = <span class="pyung"></span>평</td>
                    </tr>
                    <tr>
                        <td>연면적</td>
                        <td colspan="2"><input type="text" class="sMeter" name="scale_yeon" value="${ view.scale_yeon }">㎡ = <span class="pyung"></span>평</td>
                    </tr>
                    <tr>
                        <td>건축면적</td>
                        <td colspan="2"><input type="text" class="sMeter" name="scale_gun" value="${ view.scale_yeon }">㎡ = <span class="pyung"></span>평</td>
                    </tr>
                </table>
                <table id="forJeonse">
                    <tr>
                        <td>전세금</td>
                        <td><input type="text" name="jeonse_money_int" value="${ view.jeonse_money_int }">
                            <select name="jeonse_money_unit" id="jeonse_money_unit">
                                <option value="10000">억원</option>
                                <option value="1000">천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>관리비</td>
                        <td><input type="text" name="jeonse_seqr_money" value="${ view.jeonse_seqr_money }">만원</td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td><input type="text" name="jeonse_rend_money" value="${ view.jeonse_rend_money }">만원</td>
                    </tr>
                </table>
                <table id="forRent">
                    <tr>
                        <td>보증금</td>
                        <td><input type="text" name="rent_save_int" value="${ view.rent_save_int }">
                            <select name="rent_save_unit" id="rent_save_unit">
                                <option value="10000">억원</option>
                                <option value="1000">천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>월세</td>
                        <td><input type="text" name="rent_int" value="${ view.rent_int }">
                            <select name="rent_unit" id="rent_unit">
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>관리비</td>
                        <td><input type="text" name="rent_seqr_money" value="${ view.rent_seqr_money }">만원</td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td><input type="text" name="rent_rend_money" value="${ view.rent_rend_money }">만원</td>
                    </tr>
                </table>
                <table id="etc">
                    <tr>
                        <td>주차공간</td>
                        <td><select name="pkl" id="pkl">
                            <option value="1">있음</option>
                            <option value="0">없음</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>엘리베이터</td>
                        <td><select name="elb" id="elb">
                                <option value="1">있음</option>
                                <option value="0">없음</option>
                        </select></td>
                    </tr>
                </table>
                <table id="connect">
                    <tr>
                        <td><input type="hidden" name="mng1_kind" value="1">담당자</td>
                        <td><input type="text" name="mng1_name" value="${ view.mng1_name }"></td>
                        <td><input type="text" name="mng1_hp" value="${ view.mng1_hp }"></td>
                        <td><input id="managerPlus" type="button" value="+" /></td>
                    </tr>
                    <c:if test="${ view.mng2_kind != null }">
                    <tr>
                        <td><input type="hidden" name="mng2_kind" value="1">담당자</td>
                        <td><input type="text" name="mng2_name" value="${ view.mng2_name }"></td>
                        <td><input type="text" name="mng2_hp" value="${ view.mng2_hp }"></td>
                        <td><input id="managerMinus" type="button" value="-" /></td>
                    </tr>
                    </c:if>
                    <tr>
                        <td><select name="slr1_kind" id="seller">
                            <option value="2" selected>명의자</option>
                            <option value="3">관리자</option>
                        </select></td>
                        <td><input name="slr1_name" type="text" value="${ view.slr1_name }"></td>
                        <td><input name="slr1_hp" type="text" value="${ view.slr1_hp }"></td>
                        <td><input id="sellerPlus" type="button" value="+" /></td>
                    </tr>
                    <c:if test="${ view.slr2_kind != null }">
                    <tr>
                        <td><select name="slr2_kind" id="seller">
                            <option value="2" selected>명의자</option>
                            <option value="3">관리자</option>
                        </select></td>
                        <td><input name="slr2_name" type="text" value="${ view.slr2_name }" required></td>
                        <td><input name="slr2_hp" type="text" value="${ view.slr2_hp }" required></td>
                        <td><input id="sellerMinus" type="button" value="-" /></td>
                    </tr>
                    </c:if>
                </table>
                <input type="button" id="uploadCancle" onclick="history.back(-1);" value="취소" />
                <input type="submit" id="uploadSubmit" value="수정" />
            </form>
        </div>
    </div>
    <script type="text/javascript">
		// selected 처리
		$('#ing option').each(function(){
			if($(this).val() == "${view.ing}"){
				$(this).attr("selected", "selected");
			}
		})
	
		$('#kind_of option').each(function(){
			if($(this).val() == "${view.kind_of}"){
				$(this).attr("selected", "selected");
			}
		})
		
		$('#sale_money_unit option').each(function(){
			if($(this).val() == "${view.sale_money_unit}"){
				$(this).attr("selected", "selected");
			}
		})
		
		$('#sale_jeonse_money_unit option').each(function(){
			if($(this).val() == "${view.sale_jeonse_money_unit}"){
				$(this).attr("selected", "selected");
			}
		})
		
		$('#jeonse_money_unit option').each(function(){
			if($(this).val() == "${view.jeonse_money_unit}"){
				$(this).attr("selected", "selected");
			}
		})
		
		$('#rent_save_unit option').each(function(){
			if($(this).val() == "${view.rent_save_unit}"){
				$(this).attr("selected", "selected");
			}
		})
		
		$('#rent_unit option').each(function(){
			if($(this).val() == "${view.rent_unit}"){
				$(this).attr("selected", "selected");
			}
		})
	
	    $('#pkl option').each(function(){
			if($(this).val() == "${view.pkl}"){
				$(this).attr("selected", "selected");
			}
		})
    
		$('#elb option').each(function(){
			if($(this).val() == "${view.elb}"){
				$(this).attr("selected", "selected");
			}
		})
    </script>
    <script src="/cz/js/itemmodify.js"></script>
    <script src="/cz/js/uploadField.js"></script>
    <script src="/cz/js/dongSelector.js"></script>
</body>
</html>