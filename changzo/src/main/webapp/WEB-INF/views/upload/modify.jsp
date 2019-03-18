<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>업로드</title>
    <link rel="stylesheet" href="/cz/css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<body>
    <div class="wrapper">
        <div class="uploadrCard">
            <form action="#" method="POST">
                <table id="main">
                    <tr>
                        <td>진행상황</td>
                        <td colspan="2"><select name="now" id="now">
                            <option value="매물">매물</option>
                            <option value="진행중">진행중</option>
                            <option value="완료">완료</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>유형</td>
                        <td colspan="2"><select name="case" id="case">
                            <option value="매매">매매</option>
                            <option value="전세">전세</option>
                            <option value="월세">월세</option>
                            <option value="임대">임대</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>종류</td>
                        <td colspan="2"><select name="kindOf" id="kindOf">
                            <option value="빌딩">빌딩</option>
                            <option value="상가">상가</option>
                            <option value="상가주택">상가주택</option>
                            <option value="주택">주택</option>
                            <option value="아파트">아파트</option>
                            <option value="빌라">빌라</option>
                            <option value="토지">토지</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>주소</td>
                        <td><select name="gu" id="gu" onchange="changeDong(this)">
                            <option>구 이름</option>
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
                        <td colspan="2"><input type="text"></td>
                    </tr>
                    <tr>
                        <td>크기</td>
                        <td colspan="2"><input type="text" class="mSMeter" numberOnly>㎡ = <input type="text" class="mPyung" numberOnly></span>평</td>
                    </tr>
                    <tr>
                        <td>메모</td>
                        <td colspan="2"><input type="text"></td>
                    </tr>
                </table>
                <table id="forSale">
                    <tr>
                        <td>매매가격</td>
                        <td colspan="2"><input type="text" numberOnly>
                            <select name="sale_money" id="salemoney">
                                <option value="억원">억원</option>
                                <option value="천만원">천만원</option>
                                <option value="백만원">백만원</option>
                                <option value="십만원">십만원</option>
                                <option value="만원">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>전세금</td>
                        <td colspan="2"><input type="text" numberOnly>
                            <select name="sale_savemoney" id="salemoney">
                                <option value="억원">억원</option>
                                <option value="천만원">천만원</option>
                                <option value="백만원">백만원</option>
                                <option value="십만원">십만원</option>
                                <option value="만원">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td colspan="2"><input type="text" numberOnly>원</td>
                    </tr>
                    <tr>
                        <td>층수</td>
                        <td>지상<input type="text" numberOnly>층</td>
                        <td>지하<input type="text" numberOnly>층</td>
                    </tr>
                    <tr>
                        <td>토지면적</td>
                        <td colspan="2"><input type="text" class="sMeter" numberOnly>㎡ = <span class="pyung"></span>평</td>
                    </tr>
                    <tr>
                        <td>연면적</td>
                        <td colspan="2"><input type="text" class="sMeter" numberOnly>㎡ = <span class="pyung"></span>평</td>
                    </tr>
                    <tr>
                        <td>건축면적</td>
                        <td colspan="2"><input type="text" class="sMeter" numberOnly>㎡ = <span class="pyung"></span>평</td>
                    </tr>
                </table>
                <table id="forJeonse">
                    <tr>
                        <td>전세금</td>
                        <td><input type="text" numberOnly>
                            <select name="jeonse_savemoney" id="salemoney">
                                <option value="억원">억원</option>
                                <option value="천만원" selected>천만원</option>
                                <option value="백만원">백만원</option>
                                <option value="십만원">십만원</option>
                                <option value="만원">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>관리비</td>
                        <td><input type="text" numberOnly>원</td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td><input type="text" numberOnly>원</td>
                    </tr>
                </table>
                <table id="forRent">
                    <tr>
                        <td>보증금</td>
                        <td><input type="text" numberOnly>
                            <select name="rent_savemoney" id="salemoney">
                                <option value="억원">억원</option>
                                <option value="천만원" selected>천만원</option>
                                <option value="백만원">백만원</option>
                                <option value="십만원">십만원</option>
                                <option value="만원">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>월세</td>
                        <td><input type="text" numberOnly>
                            <select name="rent_money" id="salemoney">
                                <option value="백만원">백만원</option>
                                <option value="십만원" selected>십만원</option>
                                <option value="만원">만원</option>
                            </select></td>
                    </tr>
                    <tr>
                        <td>관리비</td>
                        <td><input type="text" numberOnly>원</td>
                    </tr>
                    <tr>
                        <td>대출금</td>
                        <td><input type="text" numberOnly>원</td>
                    </tr>
                </table>
                <table id="etc">
                    <tr>
                        <td>주차공간</td>
                        <td><select name="pkl" id="pkl">
                            <option value="있음">있음</option>
                            <option value="없음" selected>없음</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td>엘리베이터</td>
                        <td><select name="elb" id="elb">
                                <option value="있음">있음</option>
                                <option value="없음" selected>없음</option>
                        </select></td>
                    </tr>
                </table>
                <table id="connect">
                    <tr>
                        <td>담당자</td>
                        <td>홍길동</td>
                        <td>010-0238-4784</td>
                        <td><input id="managerPlus" type="button" value="+" /></td>
                    </tr>
                    <tr>
                        <td><select name="seller" id="seller">
                            <option value="명의자">명의자</option>
                            <option value="관리자">관리자</option>
                        </select></td>
                        <td><input type="text"></td>
                        <td><input type="text"></td>
                        <td><input id="sellerPlus" type="button" value="+" /></td>
                    </tr>
                </table>
                <input type="submit" id="uploadSubmit" value="수정" />
            </form>
        </div>
    </div>
    <script src="/cz/js/uploadField.js"></script>
    <script src="/cz/js/dongSelector.js"></script>
</body>
</html>