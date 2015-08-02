package cn.itcast.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理器
 * @author lenovo
 *
 */
public class CustomExceptionResolver implements HandlerExceptionResolver{
	/**
	 * 系统抛出异常
	 */

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		// handler就是处理器适配器执行Handler对象（只有method）
		//解析出异常类型
//		String message = null;
//		if(ex instanceof CustomException)
//		{
//			message = ((CustomException)ex).getMessage();
//		}
//		else
//		{
//			message = "未知错误";
//		}
		//上边代码变为
		CustomException customException = null;
		if(ex instanceof CustomException)
		{
			customException = (CustomException)ex;
		}
		else
		{
			customException = new CustomException("未知错误");
		}
		
		//错误信息
		String message = customException.getMessage();
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("message", message);
		
		modelAndView.setViewName("error");
		//如果该异常类型是系统自定义的异常，直接取出异常信息，在错误页面显示
		//如果该异常类型不是系统自定义的异常 构造一个自定义的异常类型(信息为"未知错误")
		return modelAndView;
	}

}
