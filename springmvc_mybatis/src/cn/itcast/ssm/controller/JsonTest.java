package cn.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.ssm.po.ItemsCustom;

/**
 * json��������
 * @author lenovo
 *
 */
@Controller
public class JsonTest {
	
	//����json������Ʒ��Ϣ�� ���json����Ʒ��Ϣ��
	//@RequestBody���������Ʒ��Ϣjson��ת��itemsCustom����
	//@RequestBody��itemsCustomת��json��
	@RequestMapping("/requestJson")
	public @ResponseBody ItemsCustom requestJson(@RequestBody ItemsCustom itemsCustom)
	{
		//@RequestBody��itemsCustomת��json���
		return itemsCustom;
	}
	
	//����key-value���json
	@RequestMapping("/responseJson")
	public @ResponseBody ItemsCustom responseJson(ItemsCustom itemsCustom)
	{
		//@RequestBody��itemsCustomת��json���
		return itemsCustom;
	}
	
}
