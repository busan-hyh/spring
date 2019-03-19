<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<%@ include file="./_head.jsp" %>

 <script>
   // 슬라이드
   $(document).ready(function() {
     $('#ad_main_banner').bjqs({
       'width': 775,
       'height': 145,
       'showMarkers': true,
       'showControls': false,
       'centerMarkers': false
     });
   });
   // 스티키
   $(function() {
     $("#sticky").stickySidebar({
       timer: 100,
       easing: "easeInBounce"
     });
   });
 </script>

      <article>
        <div id="ad_main_banner">
          <ul class="bjqs">
            <li><img width="775" height="145" src="${ctxPath}/img/main_banner01.jpg"></li>
            <li><img width="775" height="145" src="${ctxPath}/img/main_banner02.jpg"></li>
            <li><img width="775" height="145" src="${ctxPath}/img/main_banner03.jpg"></li>
          </ul>
        </div>
        <!-- 베스트셀러 -->
        <div class="main_book">
          <h3>베스트셀러</h3>
          <c:forEach var="vo" items="${ goodsMap.bestseller }">
          <div class="book">
            <a href="${ctxPath}/shop/view?goods_id=${ vo.GOODS_ID }">
              <img width="121" height="154" src="/booktopia/resource/thumb_${ vo.GOODS_ID }.png">
              <div class="title">${ vo.GOODS_TITLE }</div>
              <div class="price"><fmt:formatNumber value="${ vo.GOODS_SALES_PRICE }" pattern="#,###"/>원</div>
            </a>
          </div>
          </c:forEach>
        </div>

        <div id="ad_sub_banner">
          <img width="770" height="117" src="/booktopia/img/sub_banner01.jpg">
        </div>

        <!-- 새로 출판된 책 -->
        <div class="main_book">
          <h3>새로 출판된 책</h3>
          
          <c:forEach var="vo" items="${ goodsMap.newbook }">
          <div class="book">
            <a href="${ctxPath}/shop/view?goods_id=${ vo.GOODS_ID }">
              <img width="121" height="154" src="/booktopia/resource/thumb_${ vo.GOODS_ID }.png">
              <div class="title">${ vo.GOODS_TITLE }</div>
              <div class="price"><fmt:formatNumber value="${ vo.GOODS_SALES_PRICE }" pattern="#,###"/>원</div>
            </a>
          </div>
          </c:forEach>

        <div id="ad_sub_banner">
          <img width="770" height="117" src="/booktopia/img/sub_banner02.jpg">
        </div>
		</div>
		
        <!-- 스테디셀러 -->
        <div class="main_book">
          <h3>스테디셀러</h3>
          <c:forEach var="vo" items="${ goodsMap.steadyseller }">
          <div class="book">
            <a href="${ctxPath}/shop/view?goods_id=${ vo.GOODS_ID }">
              <img width="121" height="154" src="${ctxPath}/goods/thumbnail?goods_id=${vo.GOODS_ID}&fileName=${vo.FILENAME}">
              <div class="title">${ vo.GOODS_TITLE }</div>
              <div class="price"><fmt:formatNumber value="${ vo.GOODS_SALES_PRICE }" pattern="#,###"/>원</div>
            </a>
          </div>
          </c:forEach>
          
        </div>
      </article>

      <div class="clear"></div>
      <footer>
        <ul>
          <li><a href="#">회사소개</a></li>
          <li><a href="#">이용약관</a></li>
          <li><a href="#">개인정보취급방침</a></li>
          <li><a href="#">제휴/도서홍보</a></li>
          <li><a href="#">광고센터</a></li>
          <li><a href="#">고객만족센터</a></li>
          <li class="no_line"><a href="#">찾아오시는길</a></li>
        </ul>
        <div class="clear"></div>
        <a href="#"><img width="147px" height="62px" alt="Booktopia" src="/booktopia/img/Booktopia_Logo2.jpg"></a>
        <div class="info">
          ㈜북토피아 대표이사: 홍길동 / 주소 : 서울시 종로구 종로3 / 사업자등록번호 : 102-81-11111 <br>
          서울특별시 통신판매업신고번호 : 제 666호 ▶사업자정보확인 개인정보보호최고책임자 : 김길동 privacy@google.co.kr <br>
          대표전화 : 1544-1544 (발신자 부담전화) 팩스 : 0502-977-7777 (지역번호공통) <br>
          COPYRIGHT(C) 북토피아 BOOK CENTRE ALL RIGHTS RESERVED.
        </div>
      </footer>
    </div>

    <div id="sticky">
      <ul>
        <li>
          <a href="#"><img width="24" height="24" src="/booktopia/img/facebook_icon.png">페이스북</a>
        </li>
        <li>
          <a href="#"><img width="24" height="24" src="/booktopia/img/twitter_icon.png">트위터</a>
        </li>
        <li>
          <a href="#"><img width="24" height="24" src="/booktopia/img/rss_icon.png">RSS 피드</a>
        </li>
      </ul>
      <div class="recent">
        <h3>최근 본 상품</h3>
        <ul>
          <!--   상품이 없습니다. -->
          <form name="frm_sticky">
            <a href="#">
              <img width="75" height="95" id="img_sticky" src="/booktopia/resource/thumb_336.png">
            </a>
          </form>
        </ul>
      </div>
      <div>
        <h5>
          <a href="#">이전</a>&nbsp;
            <span id="cur_goods_num">1</span>/1&nbsp;
          <a href="#">다음</a>
        </h5>
      </div>
    </div>
  </div>
</body>
</html>
