<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>글보기</title> 
		<link rel="stylesheet" href="/hyh/css/style.css" />
	</head>
	<body>
		<div id="board">
			<h3>글보기</h3>
			<div class="view">
				<form action="#" method="post">
					<table>
						<tr>
							<td>제목</td>
							<td><input type="text" name="title" value="${ view.title }" readonly />
							</td>
						</tr>
						<c:if test="${ view.file != 0 }">
						<tr>
							<td>첨부파일</td>
							<td>
								<a href="#">테스트.hwp</a>
								<span>3회 다운로드</span>
							</td>
						</tr>
						</c:if>
						<tr>
							<td>내용</td>
							<td>
								<textarea name="content" rows="20" readonly>${ view.content }</textarea>
							</td>
						</tr>
					</table>
					<div class="btns">
						<c:if test="${ view.uid == member.uid }">
						<a href="/hyh/delete?seq=${ view.seq }" class="cancel del">삭제</a>
						<a href="#" class="cancel mod">수정</a>
						</c:if>
						<a href="#" class="cancel">목록</a>
					</div>
				</form>
			</div><!-- view 끝 -->
			
			<!-- 댓글리스트 -->
			<section class="comments">
				<c:if test="${ comment != null }">
				<h3>댓글목록</h3>
				</c:if>
				<c:forEach var="vo" items="${ comment }">
				<div class="comment">
					<span>
						<span>${ vo.nick }</span>
						<span>${ vo.rdate.substring(2,10) }</span>
					</span>
					<textarea>${ vo.content }</textarea>
					<div>
						<c:if test="${ vo.uid == member.uid }">
						<a href="/hyh/delete/seq=?${ vo.seq }" class="del">삭제</a>
						<a href="#" class="mod">수정</a>
						</c:if>
					</div>
				</div>
				</c:forEach>
				<c:if test="${ comment == null }">
				<p class="empty">
					등록된 댓글이 없습니다.
				</p>
				</c:if>
			</section>
			
			<!-- 댓글쓰기 -->
			<c:if test="${ member != null }">
			<section class="comment_write">
				<h3>댓글쓰기</h3>
				<div>
					<form action="#" method="post">
						<textarea name="comment" rows="5"></textarea>
						<div class="btns">
							<a href="#" class="cancel">취소</a>
							<input type="submit" class="submit" value="작성완료" />
						</div>
					</form>
				</div>
			</section>
			</c:if>
		</div><!-- board 끝 -->
	</body>

</html>










