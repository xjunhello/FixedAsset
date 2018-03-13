function successNotify(msg){
	$.notify({
		type:'success',
		title: title,
		message: msg
	});
}

function errorNotify(msg){
	$.notify({
		type:'error',
		title: title,
		message: msg
	});
}

function openWindow(title,url){
	alert(title);
	layer.open({
	      type: 2,
	      title: title,
	      shadeClose: true,
	      shade: false,
	      maxmin: true, //开启最大化最小化按钮
	      area: ['800px','400px'],
	      content: url
	});
}