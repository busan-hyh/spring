<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>업로드</title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="shortcut icon" type="image/x-icon" href="/cz/img/favi.ico" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="/cz/js/jquery.serializeObject.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="uploadrCard">
            <form action="/cz/upload" method="POST" name="uploadForm">
                <table id="main">
                    <tr>
                        <td colspan="3">물건 업로드</td>
                    </tr>
                    <tr>
                        <td>유형</td>
                        <td colspan="2"><select name="case_of" id="case_of">
                            <option value="매매" selected>매매</option>
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
                            <option value="아파트" selected>아파트</option>
                            <option value="빌라">빌라</option>
                            <option value="숙박업소">숙박업소</option>
			                <option value="토지">토지</option>
			                <option value="기타">기타</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>주소</td>
                        <td><select name="gu" id="gu" onchange="changeDong(this)" required>
                            <option value="" selected>구 이름</option>
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
                        <td><select name="dong" id="dong">
                            <option>동 이름</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>상세주소</td>
                        <td colspan="2"><input type="text" name="detail_addr" required></td>
                    </tr>
                    <tr>
                        <td>크기</td>
                        <td colspan="2"><input type="text" class="mSMeter" name="scale_meter" numberOnly required>㎡ = 
                        <input type="text" class="mPyung" name="scale_pyung" numberOnly required>평</td>
                    </tr>
                    <tr>
                        <td>메모</td>
                        <td colspan="2"><input type="text" name="memo"></td>
                    </tr>
                </table>
                <table id="forSale">
                    <tr>
                        <td>매매가격</td>
                        <td colspan="2"><input type="text" name="sale_money_int" numberOnly>
                            <select name="sale_money_unit" id="sale_money_unit">
                                <option value="10000" selected>억원</option>
                                <option value="1000">천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>전세금</td>
                        <td colspan="2"><input type="text" name="sale_jeonse_money_int" numberOnly>
                            <select name="sale_jeonse_money_unit" id="sale_jeonse_money_unit">
                                <option value="10000">억원</option>
                                <option value="1000" selected>천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td colspan="2"><input type="text" name="sale_rend_money" numberOnly>만원</td>
                    </tr>
                    <tr>
                        <td>층수</td>
                        <td>지상<input type="text" name="up_floor" numberOnly>층</td>
                        <td>지하<input type="text" name="down_floor" numberOnly>층</td>
                    </tr>
                    <tr>
                        <td>토지면적</td>
                        <td colspan="2"><input type="text" class="sMeter" name="scale_toji" numberOnly>㎡ = <span class="pyung"></span>평</td>
                    </tr>
                    <tr>
                        <td>연면적</td>
                        <td colspan="2"><input type="text" class="sMeter" name="scale_yeon" numberOnly>㎡ = <span class="pyung"></span>평</td>
                    </tr>
                    <tr>
                        <td>건축면적</td>
                        <td colspan="2"><input type="text" class="sMeter" name="scale_gun" numberOnly>㎡ = <span class="pyung"></span>평</td>
                    </tr>
                </table>
                <table id="forJeonse">
                    <tr>
                        <td>전세금</td>
                        <td><input type="text" name="jeonse_money_int" numberOnly>
                            <select name="jeonse_money_unit" id="jeonse_money_unit">
                                <option value="10000">억원</option>
                                <option value="1000" selected>천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>관리비</td>
                        <td><input type="text" name="jeonse_seqr_money" numberOnly>만원</td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td><input type="text" name="jeonse_rend_money" numberOnly>만원</td>
                    </tr>
                </table>
                <table id="forRent">
                    <tr>
                        <td>보증금</td>
                        <td><input type="text" name="rent_save_int" numberOnly>
                            <select name="rent_save_unit" id="rent_save_unit">
                                <option value="10000">억원</option>
                                <option value="1000" selected>천만원</option>
                                <option value="100">백만원</option>
                                <option value="10">십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>월세</td>
                        <td><input type="text" name="rent_int" numberOnly>
                            <select name="rent_unit" id="rent_unit">
                                <option value="100">백만원</option>
                                <option value="10" selected>십만원</option>
                                <option value="1">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>관리비</td>
                        <td><input type="text" name="rent_seqr_money" numberOnly>만원</td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td><input type="text" name="rent_rend_money" numberOnly>만원</td>
                    </tr>
                </table>
                <table id="etc">
                    <tr>
                        <td>주차공간</td>
                        <td><select name="pkl" id="pkl">
                            <option value="1">있음</option>
                            <option value="0" selected>없음</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>엘리베이터</td>
                        <td><select name="elb" id="elb">
                                <option value="1">있음</option>
                                <option value="0" selected>없음</option>
                        </select></td>
                    </tr>
                </table>
                <table id="connect">
                    <tr>
                        <td><input type="hidden" name="mng1_kind" value="1">담당자</td>
                        <td><input type="text" name="mng1_name" value="${ name }"></td>
                        <td><input type="text" name="mng1_hp" value="${ hp }"></td>
                        <td><input id="managerPlus" type="button" value="+" /></td>
                    </tr>
                    <tr>
                        <td><select name="slr1_kind" id="seller">
                            <option value="2" selected>명의자</option>
                            <option value="3">관리자</option>
                        </select></td>
                        <td><input name="slr1_name" type="text" value="" required></td>
                        <td><input name="slr1_hp" type="text" value="" required></td>
                        <td><input id="sellerPlus" type="button" value="+" /></td>
                    </tr>
                </table>
                <input type="button" id="uploadCancle" onclick="history.back(-1);" value="취소" />
                <input type="submit" id="uploadSubmit" value="저장" />
            </form>
        </div>
    </div>
    <script src="/cz/js/uploadField.js"></script>
    <script src="/cz/js/dongSelector.js"></script>
</body>
</html>