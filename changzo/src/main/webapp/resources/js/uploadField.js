$(document).ready(function(){
    $('#case').change(function(){
        var state = $('#case option:selected').val();

        if(state == '매매') {
            $('#forSale').show();
            $('#forJeonse').hide();
            $('#forRent').hide();
        } else if(state == '전세') {
            $('#forSale').hide();
            $('#forJeonse').show();
            $('#forRent').hide();
        } else {
            $('#forSale').hide();
            $('#forJeonse').hide();
            $('#forRent').show();
        }
    })
})
// 엔터키 막기
$('input[type="text"]').keydown(function() {
    if (event.keyCode === 13) {
        event.preventDefault();
    }
});
// numberOnly 텍스트필드에 숫자만 허용하기
$("input:text[numberOnly]").on("keyup", function() {
    $(this).val($(this).val().replace(/[^0-9.]/g,""));
});

$(document).ready(function(){
	$('#managerPlus').bind('click', function(){
	    var managerInner = '<tr><td><input type="hidden" name="mng2_kind" value="1">담당자</td>';
	    managerInner += '<td><input type="text" name="mng2_name" value=" "></td>';
	    managerInner += '<td><input type="text" name="mng2_hp" value=" "></td>';
	    managerInner += '<td><input id="managerMinus" type="button" value="-" /></td></tr>';
	    $(this).closest('tr').after(managerInner);
	    $(this).hide();
	})
	$(document).on('click','#managerMinus',function(){
		$('#managerPlus').show();
	    $(this).closest('tr').remove();
	})

	$('#sellerPlus').bind('click',function(){
	    var sellerInner = '<tr><td><select name="slr2_kind" id="seller"><option value="2" selected>명의자</option>';
	    sellerInner += '<option value="3">관리자</option></select></td>';
	    sellerInner += '<td><input name="slr2_name" type="text" value=" "></td>';
	    sellerInner += '<td><input name="slr2_hp" type="text" value=" "></td>';
	    sellerInner += '<td><input id="sellerMinus" type="button" value="-" /></td></tr>';
	    $(this).closest('tr').after(sellerInner);
	    $(this).hide();
	})
	$(document).on('click','#sellerMinus',function(){
		$('#sellerPlus').show();
	    $(this).closest('tr').remove();
	})
})

// 메인카드 제곱미터 ↔ 평형
$('.mSMeter').on('keyup',function(){
    var mSMter = $(this).val();

    $(this).siblings('input').val((mSMter*0.3025).toFixed(2));
})
$('.mPyung').on('keyup',function(){
    var mPyung = $(this).val();

    $(this).siblings('input').val((mPyung/0.3025).toFixed(2));
})
// 제곱미터 to 평형
$(document).on('keyup','.sMeter',function(){
    var sMeter = $(this).val();

    $(this).siblings('span').text((sMeter*0.3025).toFixed(2));
})

// 주소 구이름/동이름 선택시 submit 비활성화등 필수입력란 채우기 강제하기. required는 다른 submit 버튼이라 안먹히는듯