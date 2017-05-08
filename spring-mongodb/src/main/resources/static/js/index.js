$(function(){

    $.ajax({
        type: "DELETE",
		url: 'http://localhost:8080/users/3',
		dataType:'json',
        data:null,
		cache: false,
		success: function(data){
			
		},
		error:function(err){
		}
    });

})