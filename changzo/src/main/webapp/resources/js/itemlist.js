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
	var case_of = $('.listheader h2 span').text();
	var paramList = $('#paramList').val();
	var gu = $(this).val();
	if(paramList == 'list'){
		// list에서 검색하는 경우
		if(gu == '전체구'){
			location.replace('/cz/'+paramList+'?case_of='+case_of);
		} else {
			location.replace('/cz/guSerch?paramList='+paramList+'&case_of='+case_of+'&gu='+gu);
		}
	} else {
		// mylist에서 검색하는 경우(case_of, kind_of, gu 세개로 검색)
	}
	
})

// 구 선택>검색>새로고침 후 해당 구로 자동 selected
$(document).ready(function(){
	$('#gu option').each(function(){
		var paramGu = $('#paramGu').val();
		if($(this).val() == paramGu){
			$(this).attr("selected", "selected");
		}
	})
})