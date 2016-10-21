
/*给编辑框内赋值*/
function data_tTOedit(){
	$("#gamename_edit").val(data_t.gamename);
	$("#introduction_edit").val(data_t.introduction);
	//$("#price_edit").val(data_t.price);
	alert(data_t.price)
	if(data_t.price!=10){
		alert(11)
		$("#price_edit").val(data_t.price);
	}
	
	
	$("#type_edit").val(data_t.type);
}

/* 提示框*/
function Confirm(msg, control) {  
    $.messager.confirm("Submit a form?", msg, function (r) {  
        if (r) {  
        	updateGame();
            return true;  
        }  
    });  
    return false;  
}

/*修改游戏参数*/
function updateGame(){
	
	var id = Number(data_t.id);
	var gamename = $("#gamename_edit").val();
	var type = "game";
	//var price = Number($("#price_edit").val());
	var price = $("#price_edit").val();
	alert(price)
	var introduction = $("#introduction_edit").val();
	
	
		$.ajax({
    		url:"/weshare/g/eg",
        	type:"POST",
        	cache:false,
    	headers:{
        	'Content-Type':'application/json',
        	'Accept':'application/json'
    		},
    		dataType:"json",
    		data: JSON.stringify({
	        			"id":id,
						"gamename":gamename,
						"type" : type,
						"price":price ,
						"introduction":introduction
    		}),
    error: function(){},
    success: function(data){
    	
   		$("#bianjiyouxiKuang").window("close");
    	
    	$("#game").datagrid("reload");
    }
    });
}


/* 上传游戏图片 */
function ajaxFileUpload(){
	var isNotNull =  document.getElementById("gameImageUpload");
	if(isNotNull.value!=""){
		$.ajaxFileUpload({

        //处理文件上传操作的服务器端地址(可以传参数,已亲测可用)

        url:"wj/sya?gameId="+data_t.id+"&deviceno="+data_t.gamename,

        secureuri:false,                       //是否启用安全提交,默认为false

        fileElementId:'gameImageUpload',           //文件选择框的id属性

        dataType:'text',                       //服务器返回的格式,可以是json或xml等

        success:function(data, status){        //服务器响应成功时的处理函数

            if("200"==data){
            	$("#uploadImagKuang").window("close");
    			$("#game").datagrid("reload");
            	$.messager.alert("提示","上传成功");
            }
        },

       error:function(data, status, e){ //服务器响应失败时的处理函数

            console.log(e);

            console.log(data);

            $('#result').html('APK上传失败，请重试！！');

        }

    });
	}else{
            	$.messager.alert("提示","文件不能为空");
            }
}

/* 游戏安装包zip上传 */
function ajaxFileUploadForZip(){
	var isNotNull =  document.getElementById("gameZipUpload");
	
	if(isNotNull.value!=""){
		$.ajaxFileUpload({

        //处理文件上传操作的服务器端地址(可以传参数,已亲测可用)

        url:"g/cyx",

        secureuri:false,                       //是否启用安全提交,默认为false

        fileElementId:'reUploadYouxi',           //文件选择框的id属性

        dataType:'text',                       //服务器返回的格式,可以是json或xml等

        success:function(data, status){        //服务器响应成功时的处理函数
			
            if("200"==data){
            	//$("#reUploadYouxi").window("close");
    			$("#game").datagrid("reload");
            	$.messager.show({  
			                title: '提示',  
			                msg: '成功',  
			                showType: 'fade',
			                timeout :2,
			                style:{
								left:'',
								right:1000,
								bottom:''
							}
						})
            }
        }

    });
	}else{
            	$.messager.alert("提示","文件不能为空");
            }
}

/*判断是否已经上传过图片 ,如果上传过,就在弹窗中展示一下*/
function showImage(){
	var imageId = data_t.extend2;
	if(imageId!=null&&imageId!=""){
		$('#showImage').html(
			'<figure itemprop="associatedMedia" itemscope itemtype="http://schema.org/ImageObject">'
							+ "<a href=\"wj/dl?id="
							+imageId
							+ "\" itemprop=\"contentUrl\" data-size=\"9x12\">"
							+ "<img src=\"wj/dl?id="
							+imageId
							+ "\" itemprop=\"thumbnail\" alt=\"Image description\" height=\"200\" width=\"200\"/></a>"
							+ "<figcaption itemprop=\"caption description\">游戏截图"
							+ "</figcaption></figure>"
		)
	}
	$("#uploadImagKuang").window("open");
}
