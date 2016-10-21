(function($){
	var _ajax = $.ajax;
	
	$.ajax = function(opt){
		var fn = {
				error:function(XMLHttpRequest,textStatus,errorThrown){},
				success:function(data,textStatus){}
		}
		if(opt.error){
			fn.error = opt.error;
		}
		
		if(opt.error){
			fn.success=opt.success;
		}
		
		var _opt = $.extend(opt,{
			error:function(XMLHttpRequest,textStatus,errorThrown){
				console.debug("error info.");
				console.log(errorThrown);
				fn.error(XMLHttpRequest,textStatus,errorThrown);
			},
			success:function(data,textStatus){
				console.debug("success info.");
				var t = Object.prototype.toString.apply(data);
				var type = t.replace('[','').replace(']','').split(' ')[1];
				if(type != "Object"){
					fn.success(data,textStatus);
					return;
				}
				fn.success(data.data,textStatus);
			}
		});
		
		return _ajax(_opt);
	};
})(jQuery);