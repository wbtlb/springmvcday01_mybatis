package cn.itcast.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * <p>Title: HandlerInterceptor1</p>
 * <p>Description:����������1 </p>
 * <p>Company: www.itcast.com</p> 
 * @author	����.����
 * @date	2015-4-14����4:45:47
 * @version 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {

	
	//���� Handler����֮ǰִ��
	//���������֤�������Ȩ
	//���������֤�������֤ͨ����ʾ��ǰ�û�û�е�½����Ҫ�˷������ز�������ִ��
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		//��ȡ�����url
		String url = request.getRequestURI();
		//�ж�url�Ƿ��ǹ�����ַ��ʵ��ʹ��ʱ��������ַ���õ������ļ��У�
		if(url.indexOf("login.action") >= 0)
		{
			return true;
		}
		//�ж�session
		HttpSession session = request.getSession();
		//��session��ȡ���û������Ϣ
		String username = (String) session.getAttribute("username");
		if(username != null)
		{
			//�����Ϣ���� ����
			return true;
		}
		
		//ִ�е������ʾ�����Ҫ��֤����ת����½ҳ��
		request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request,response);
		
		//return false��ʾ���أ�������ִ��
		//return true��ʾ����
		return false;
	}

	//����Handler����֮�󣬷���modelAndView֮ǰִ��
	//Ӧ�ó�����modelAndView�����������õ�ģ������(����˵�����)�����ﴫ����ͼ��Ҳ����������ͳһָ����ͼ
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("HandlerInterceptor1...postHandle");
		
	}

	//ִ��Handler���ִ�д˷���
	//Ӧ�ó�����ͳһ�쳣����ͳһ��־���� �����зŵ�����������һ��λ����Ҫ����
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("HandlerInterceptor1...afterCompletion");
	}

}
