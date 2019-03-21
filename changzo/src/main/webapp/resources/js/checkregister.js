$(function(){
	//필드의 키보드이벤트 인식해서 4자이상 쓸때마다 확인하기
	$('input[name=uid]').keyup(function(){
		//↑의 벨류 얻기
		var tag = $(this);
		var value = $(this).val();
		//console.log('입력값 : '+value);
		if(value.length >= 4){
			//UserCheckService.java에게 콜하고 JSON을 백받는다. JAON은 (data)가 된다.
			$.ajax({
				url: '/cz/usercheck',
				data: "uid="+value,
				type: "GET",
				dataType: 'JSON',
				contentType:"application/json;charset=UTF-8",
				success: function(data){
						if(data.result == 1){
							$('.resultId').css('color', 'red').text('이미 사용중');
							isUidOk = false;
							tag.focus();
						} else {
							$('.resultId').css('color', 'green').text('사용가능');
							isUidOk = true;
						}
				}
			})
			
			
		}
	})
	
	$('input[name=pass_check]').keyup(function(){
		var pass1 = $('#pass').val();
		var pass2 = $(this).val();
		
		if(pass1 == pass2){
			$('.resultPass').css('color', 'green').text('비밀번호가 일치합니다');
			
		} else {
			$('.resultPass').css('color', 'red').text('비밀번호가 다릅니다');
		}
	})
})