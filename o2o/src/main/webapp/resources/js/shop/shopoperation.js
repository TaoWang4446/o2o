$(function() {
	var initUrl = '/o2o/shopadmin/getshopinitinfo';
	var registerShopUrl = '/o2o/shopadmin/registershop';
	alert(initUrl);
	getshopinitinfo();
	function getshopinitinfo() {
		$.getJSON(initUrl, function(data) {
			if (data.success) {
				var tempHtml = '';
				var tempAreaHtml = '';
				data.shopCategoryList.map(function(item, index) {
					tempHtml += '<option data-id="' + item.shopCategoryId
							+ '">' + item.shopCategoryName + '</option>';
				});

				data.areaList.map(function(item, index) {
					tempAreaHtml += '<option data-id="' + item.areaId + '">'
							+ item.areaName + '</option>';
				});

				$('#shop-category').html(tempHtml);
				$('#area').html(tempAreaHtml);
			}
		});
		
		$('#submit').click(function(){
			// 创建shop对象
			var shop = {};
			// 获取表单里的数据并填充进对应的店铺属性中
			shop.shopName = $('#shop-name').val();
			shop.shopAddr = $('#shop-addr').val();
			shop.phone = $('#shop-phone').val();
			shop.shopDesc = $('#shop-desc').val();
			// 选择选定好的店铺类别
			shop.shopCategory = {
				shopCategoryId : $('#shop-category').find('option').not(function() {
					return !this.selected;
				}).data('id')
			};
			// 选择选定好的区域信息
			shop.area = {
				areaId : $('#area').find('option').not(function() {
					return !this.selected;
				}).data('id')
			};
			// 获取上传的图片文件流
			var shopImg = $('#shop-img')[0].files[0];
			// 生成表单对象，用于接收参数并传递给后台
			var formData = new FormData();
			forData.append('shopImg',shopImg);
			forData.append('shopStr',JSON.stringify(shop));
			var verifyCodeActual = $('#j_captcha').val();
			if(!verifyCodeActual){
				$.toast('请输入验证码！');
				return;
			}
			
			forData.append('verifyCodeActual',verifyCodeActual);
			
		    $.ajax({
		    	url:registerShopUrl,
		    	type:'POST',
		    	data : formData,
				contentType : false,
				processData : false,
				cache : false,
				success : function(data) {
					if (data.success) {
						$.toast('提交成功！');
					} else {
						$.toast('提交失败！' + data.errMsg);
					}
					$('#captcha_img').click();
				}
		    });
		});
	}
})