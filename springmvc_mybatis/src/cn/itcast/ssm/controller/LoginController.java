package cn.itcast.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	//��½
	@RequestMapping("/login")
	public String login(HttpSession session,String username,String password) throws Exception
	{
		//����service�����û������֤
		//...
		
		//session�б����û������Ϣ
		session.setAttribute("username", username);
		
		//�ض�����Ʒ�б�
		return "redirect:/items/queryItems.action";
		
	}
	
	//�˳�
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception
	{
		//���session
		session.invalidate();
		
		//�ض�����Ʒ�б�ҳ��
		return "redirect:/items/queryItems.action";
	}
}
