<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <link href="/booktopia/css/style.css" rel="stylesheet" type="text/css" media="screen">
  <link href="/booktopia/css/basic-jquery-slider.css" rel="stylesheet" type="text/css" media="screen">
  <link href="/booktopia/css/mobile.css" rel="stylesheet" type="text/css">
  <script src="/booktopia/js/jquery-1.6.2.min.js" type="text/javascript"></script>
  <script src="/booktopia/js/jquery.easing.1.3.js" type="text/javascript"></script>
  <script src="/booktopia/js/stickysidebar.jquery.js" type="text/javascript"></script>
  <script src="/booktopia/js/basic-jquery-slider.js" type="text/javascript"></script>
  <script src="/booktopia/js/tabs.js" type="text/javascript"></script>
  <script src="/booktopia/js/carousel.js" type="text/javascript"></script>
  <title>북토피아::상품 리스트</title>
</head>

<body>
  <div id="outer_wrap">
    <div id="wrap">
      <header>
        <div id="logo">
          <a href="#"><img width="176" height="80" alt="booktopia" src="/booktopia/img/Booktopia_Logo.jpg"></a>
        </div>
        <div id="head_link">
          <ul>
            <li><a href="#">로그인</a></li>
            <li><a href="#">회원가입</a></li>
            <li><a href="#">고객센터</a></li>
          </ul>
        </div>
        <br>
        <div id="search">
          <form name="frmSearch" action="#">
            <input name="searchWord" class="main_input" type="text" onkeyup="keywordSearch()">
            <input type="submit" name="search" class="btn1" value="검 색">
          </form>
        </div>
        <div id="suggest">
          <div id="suggestList"></div>
        </div>
      </header>
      <div class="clear"></div>
      <aside>
        <nav>
          <ul>
            <li>
              <h3>국내외 도서</h3>
              <ul>
                <li><a href="#">IT/인터넷</a></li>
                <li><a href="#">경제/경영</a></li>
                <li><a href="#">대학교재</a></li>
                <li><a href="#">자기계발</a></li>
                <li><a href="#">자연과학/공학</a></li>
                <li><a href="#">역사/인문학</a></li>
              </ul>
            </li>
            <li>
              <h3>음반</h3>
              <ul>
                <li><a href="#">가요</a></li>
                <li><a href="#">록</a></li>
                <li><a href="#">클래식</a></li>
                <li><a href="#">뉴에이지</a></li>
                <li><a href="#">재즈</a></li>
                <li><a href="#">기타</a></li>
              </ul>
            </li>

          </ul>
        </nav>
        <div class="clear"></div>
        <div id="banner">
          <a href="#"><img width="190" height="163" src="/booktopia/img/n-pay.jpg"> </a>
        </div>
        <div id="notice">
          <h2>공지사항</h2>
          <ul>
            <li><a href="#">공지사항입니다.1</a></li>
            <li><a href="#">공지사항입니다.2</a></li>
            <li><a href="#">공지사항입니다.3</a></li>
            <li><a href="#">공지사항입니다.4</a></li>
            <li><a href="#">공지사항입니다.5</a></li>
          </ul>
        </div>
        <div id="banner">
          <a href="#"><img width="190" height="362" src="/booktopia/img/side_banner1.jpg"></a>
        </div>
        <div id="banner">
          <a href="#"><img width="190" height="104" src="/booktopia/img/call_center_logo.jpg"></a>
        </div>
        <div id="banner">
          <a href="#"><img width="190" height="69" src="/booktopia/img/QnA_logo.jpg"></a>
        </div>
      </aside>
      <article>
        <!-- 상품 리스트 -->
        <section class="list">
          <nav>
            <h1>IT/인터넷</h1>
          </nav>
          <ul class="sort">
            <li><a href="#">판매많은순</a></li>
            <li><a href="#">낮은가격순</a></li>
            <li><a href="#">높은가격순</a></li>
            <li><a href="#">평점높은순</a></li>
            <li><a href="#">후기많은순</a></li>
            <li><a href="#">최근등록순</a></li>
          </ul>
          <section>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./resource/thumb_336.png" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">짠테크 가계부</h3>
                  <p class="desc">
                    <a href="#">마인크래프트를 이용해 코딩을 배울 수 있다는 이야기를 들어 본 적 있나요? ...</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;블루포스</h4>
                  <h5 class="badge power">판매자등급</h5>
                  <h6 class="rating star1">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t2.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge great">판매자등급</h5>
                  <h6 class="rating star2">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t3.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star3">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t4.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star4">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t5.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상정명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star5">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t5.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star5">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t5.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star5">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t5.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star5">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t5.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star5">상품평</h6>
                </li>
              </ul>
            </article>
            <article>
              <ul>
                <li>
                  <a href="#" class="thumb"><img src="./img/thumb-sample-t5.jpg" alt="상품이미지"></a>
                </li>
                <li>
                  <h3 class="name">상품명</h3>
                  <p class="desc">
                    <a href="#">상품설명</a>
                  </p>
                </li>
                <li>
                  <div class="dis_price">
                    <ins>27,000</ins>
                  </div>
                  <div class="org_price">
                    <del>30,000</del>
                    <span>10%</span>
                  </div>
                  <span class="freeshipping">무료배송</span>
                </li>
                <li>
                  <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자상점명</h4>
                  <h5 class="badge power great">판매자등급</h5>
                  <h6 class="rating star5">상품평</h6>
                </li>
              </ul>
            </article>
          </section>
          <div class="paging">
            <span class="prev">
              <a href="#">&lt;&nbsp;이전</a>
            </span>
            <span class="num">
              <a href="#" class="on">1</a>
              <a href="#">2</a>
              <a href="#">3</a>
              <a href="#">4</a>
              <a href="#">5</a>
              <a href="#">6</a>
              <a href="#">7</a>
            </span>
            <span class="next">
              <a href="#">다음&nbsp;&gt;</a>
            </span>
          </div>
        </section>

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
