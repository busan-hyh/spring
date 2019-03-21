// list to view 셀렉터
$(document).on('click','.list tbody tr',function(){
    var seq = $(this).children('td').children('input[name=seq]').val();
    console.log(seq);
    location.href = '/cz/view?seq='+seq;
})
// mylist to view 셀렉터
$(document).on('click','.mylist tbody tr',function(){
    var seq = $(this).children('td').children('input[name=seq]').val();
    
    location.href = '/cz/view?seq='+seq;
})

// 테이블 정렬
$(document).ready(function(){
	$("#sortList").tablesorter();
});

// 정렬버튼클릭으로 같은효과내기
$('#orderPrice').bind("click", function(){
	$("#sortList thead tr th:nth-child(4)").trigger('click');
})
$('#orderPyung').bind("click", function(){
	$("#sortList thead tr th:nth-child(3)").trigger('click');
})

// 구 선택시
$('#gu').on('change', function(){
	var paramList = $('#paramList').val();
	var gu = $('#gu').val();
	var kind_of = $('#kind_of').val();
	
	if(paramList == 'list'){
		var case_of = $('.listheader h2 span').text();
		// list에서 검색하는 경우
		if(kind_of == '전체'){
			kind_of = '';
		}
		if(gu == '전체구'){
			gu = '';
		}
		location.replace('/cz/guSearch?case_of='+case_of+'&kind_of='+kind_of+'&gu='+gu);
		
	} else {
		// mylist에서 검색하는 경우(case_of, kind_of, gu 세개로 검색)
		var case_of = $('#case_of').val();
		
		if(case_of == '전체'){
			case_of = '';
		}
		if(kind_of == '전체'){
			kind_of = '';
		}
		if(gu == '전체구'){
			gu = '';
		}
		location.replace('/cz/mySearch?case_of='+case_of+'&kind_of='+kind_of+'&gu='+gu);
	}
	
})

// kind_of 선택시
$('#kind_of').on('change', function(){
	var paramList = $('#paramList').val();
	
	var gu = $('#gu').val();
	var kind_of = $('#kind_of').val();
	
	if(paramList == 'list'){
		// list에서 선택
		var case_of = $('.listheader h2 span').text();
		// list에서 검색하는 경우
		if(kind_of == '전체'){
			kind_of = '';
		}
		if(gu == '전체구'){
			gu = '';
		}
		location.replace('/cz/guSearch?case_of='+case_of+'&kind_of='+kind_of+'&gu='+gu);
	} else {
		// mylist에서 선택
		var case_of = $('#case_of').val();
		
		if(case_of == '전체'){
			case_of = '';
		}
		if(kind_of == '전체'){
			kind_of = '';
		}
		if(gu == '전체구'){
			gu = '';
		}
		location.replace('/cz/mySearch?case_of='+case_of+'&kind_of='+kind_of+'&gu='+gu);
	}
})

// mylist에서 case_of 선택시
$('#case_of').on('change', function(){
	var gu = $('#gu').val();
	var case_of = $('#case_of').val();
	var kind_of = $('#kind_of').val();
	
	if(case_of == '전체'){
		case_of = '';
	}
	if(kind_of == '전체'){
		kind_of = '';
	}
	if(gu == '전체구'){
		gu = '';
	}
	location.replace('/cz/mySearch?case_of='+case_of+'&kind_of='+kind_of+'&gu='+gu);
})


// 구 선택>검색>새로고침 후 해당 구로 자동 selected
$(document).ready(function(){
	$('#gu option').each(function(){
		var paramGu = $('#paramGu').val();
		if($(this).val() == paramGu){
			$(this).attr("selected", "selected");
		}
	})
	// mylist에서 case_of, kind_of 선택후 자동 selected
	$('#case_of option').each(function(){
		var paramCase_of = $('#paramCase_of').val();
		if($(this).val() == paramCase_of){
			$(this).attr("selected", "selected");
		}
	})
	$('#kind_of option').each(function(){
		var paramKind_of = $('#paramKind_of').val();
		if($(this).val() == paramKind_of){
			$(this).attr("selected", "selected");
		}
	})
})