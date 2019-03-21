$(document).ready(function(){
	
	// case_of trigger 실행
	$.getScript("/cz/js/uploadField.js", function(){
		var case_of = $('#case_of').parent().parent().children('td').children('input');
		$('#case_of option').each(function(){
			if($(this).val() == case_of.val()){
				$(this).attr("selected", "selected");
				$('#case_of').trigger("change");
			}
		})
	})
	
	// gu -> dong selecter trigger 실행
	$.getScript("/cz/js/dongSelector.js", function(){
		var gu = $('#gu').parent().parent().children('td').children('input');
		$('#gu option').each(function(){
			if($(this).val() == gu.val()){
				$(this).attr("selected", "selected");
				$('#gu').trigger("change");
				
				var dong = $('#dong').parent().parent().children('td').children('input:nth-child(2)');
				$('#dong option').each(function(){
					if($(this).val() == dong.val()){
						$(this).attr("selected", "selected");
					}
				})
			}
		})	
	})

})