package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.ssm.po.ItemsCustom;

/**
 * json交互测试
 * @author lenovo
 *
 */
@Controller
public class JsonTest {
	
	//请求json串（商品信息） 输出json（商品信息）
	//@RequestBody将请求的商品信息json串转成itemsCustom对象
	//@RequestBody将itemsCustom转成json串
	@RequestMapping("/requestJson")
	public @ResponseBody ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom)
	{
		//@RequestBody将itemsCustom转成json输出
		return itemsCustom;
	}
	
	//请求key-value输出json
	@RequestMapping("/responseJson")
	public @ResponseBody ItemsCustom responseJson(ItemsCustom itemsCustom)
	{
		//@RequestBody将itemsCustom转成json输出
		return itemsCustom;
	}
	
}
