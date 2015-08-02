package cn.itcast.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * ȫ���쳣������
 * @author lenovo
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{
	/**
	 * ϵͳ�׳��쳣
	 */

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// handler���Ǵ�����������ִ��Handler����ֻ��method��
		//�������쳣����
//		String message = null;
//		if(ex instanceof CustomException)
//		{
//			message = ((CustomException)ex).getMessage();
//		}
//		else
//		{
//			message = "δ֪����";
//		}
		//�ϱߴ����Ϊ
		CustomException customException = null;
		if(ex instanceof CustomException)
		{
			customException = (CustomException)ex;
		}
		else
		{
			customException = new CustomException("δ֪����");
		}
		
		//������Ϣ
		String message = customException.getMessage();
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", message);
		
		modelAndView.setViewName("error");
		//������쳣������ϵͳ�Զ�����쳣��ֱ��ȡ���쳣��Ϣ���ڴ���ҳ����ʾ
		//������쳣���Ͳ���ϵͳ�Զ�����쳣 ����һ���Զ�����쳣����(��ϢΪ"δ֪����")
		return modelAndView;
	}

}
