function successNotify(title,msg){
	Lobibox.notify('success', {
	    position : 'top right',
	    title:title,
	    msg : msg
	});
}

function errorNotify(title,msg){
	
	
	Lobibox.notify('error', {
	    position : 'top right',
	    title:title,
	    msg : msg
	});
}

function openWindow(title,url){
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