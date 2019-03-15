$(function(){
	var btnComment = $('.comment_write .submit');//이번엔 추가하자마자 ajax를 통해 바로 추가되는 형식으로(페이지 새로고침이 아님)
	
	btnComment.click(function(){
		var parent	= $('.comment_write input[name=parent]').val();
		var uid		= $('.comment_write input[name=uid]').val();
		var nick	= $('.comment_write input[name=nick]').val();
		var content = $('.comment_write textarea').val();
		
		var json = {"parent":parent, "uid":uid, "nick":nick, "content":content};//json은 '가 아니라 " 반드시!!
		
		$.ajax({
			url: '/hyh/writecomment',
			data: JSON.stringify(json),//POST타입을 전송할때 데이터는 data옵션에 넣음
			type: "POST",
			dataType: 'JSON',
			contentType:"application/json;charset=UTF-8",
			success:function(result){
				//방금쓴 json을 다시 받아옴(날짜를 더해서)
				var comments = $('.comments');
				var comment = $('.comments > .comment:last');//선택자 
				
				if (comment){
					var commentCloned = comment.clone();
					commentCloned.find('span > .nick').text(result.nick);
					commentCloned.find('span > .date').text(result.date);
					commentCloned.find('textarea').text(result.content);
					comments.append(commentCloned);
				} else {
					// 첫번째 댓글이 없을 경우.. 클론이 아니라 생성해야함...
				}
			}
		});
		return false;//submit실행을 막기위해
	});
});