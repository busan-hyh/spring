$(document).ready(function(){
    $('#forSale').show();
    $('#forJeonse').hide();
    $('#forRent').hide();

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
    // 담당자 추가 삭제
    $('#managerPlus').bind('click', function(){
    	
        var manager = $(this).parent().parent();
        var managerClone = manager.clone();
        managerClone.find('input').val('');
        managerClone.find('input:first').val('1');
        managerClone.find('input').attr('name','manager2');
        managerClone.find('#managerPlus').attr('value','-');
        managerClone.find('#managerPlus').attr('id','managerMinus');
        
        $(this).closest('tr').after(managerClone);
        $(this).css('display','none');
    })
    $(document).on('click','#managerMinus',function(){
//        $(this).closest('tr').remove();
    	
    	
    	
    	////////////////////////////////////////
        $('#managerPlus').css('display','block');
        $('#manager2 *').css('display','none');
        ////////////////////////////////////////
    })

    // 명의자 추가 삭제
    $('#sellerPlus').bind('click',function(){
        var seller = $(this).parent().parent();
        var sellerClone = seller.clone();
        sellerClone.find('input').val('');
        sellerClone.find('select').attr('name','seller2');
        sellerClone.find('input').attr('name','seller2');
        sellerClone.find('#sellerPlus').attr('value','-');
        sellerClone.find('#sellerPlus').attr('id','sellerMinus');
        
        $(this).closest('tr').after(sellerClone);
        $(this).css('display','none');
    })
    $(document).on('click','#sellerMinus',function(){
        $(this).closest('tr').remove();
        $('#sellerPlus').css('display','block');
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