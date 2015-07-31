package cn.itcast.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.service.ItemsService;

/**
 * 
 * <p>
 * Title: ItemsController
 * </p>
 * <p>
 * Description:商品的controller
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 * 
 * @author 传智.燕青
 * @date 2015-4-13下午4:03:35
 * @version 1.0
 */
@Controller
//为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
//比如：商品列表：/items/queryItems.action
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemsService itemsService;

	// 商品查询
	@RequestMapping("/queryItems")
	public ModelAndView queryItems(HttpServletRequest request) throws Exception {
		//测试forward后request是否可以共享
		
		System.out.println(request.getParameter("id"));

		// 调用service查找 数据库，查询商品列表
		List<ItemsCustom> itemsList = itemsService.findItemsList(null);
		
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过itemsList取数据
		modelAndView.addObject("itemsList", itemsList);

		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("items/itemsList");

		return modelAndView;

	}
	
	//商品信息修改页面显示
//	@RequestMapping("/editItems")
//	public ModelAndView editItems() throws Exception
//	{
//		//调用service根据商品id查询商品信息
//		ItemsCustom itemsCustom = itemsService.findItemsById(1);
//		
//		//返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		
//		//将商品信息放到model
//		modelAndView.addObject("itemsCustom",itemsCustom);
//		
//		//商品修改页面
//		modelAndView.setViewName("items/editItems");
//		
//		return modelAndView;
//		
//	}
	
	@RequestMapping(value="/editItems",method={RequestMethod.POST,RequestMethod.GET})
	public String editItems(Model model) throws Exception
	{
		//调用service根据商品id查询商品信息
		ItemsCustom itemsCustom = itemsService.findItemsById(1);
		
		//返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		
//		//将商品信息放到model
//		modelAndView.addObject("itemsCustom",itemsCustom);
//		
//		//商品修改页面
//		modelAndView.setViewName("items/editItems");
		
		//通过形参中的model将model数据传到页面中
		model.addAttribute("itemsCustom",itemsCustom);
		
		return "items/editItems";
		
	}


	//商品信息修改提交
	@RequestMapping("/editItemsSubmit")
	public ModelAndView editItemsSubmit() throws Exception
	{
		//调用service更新商品信息，页面需要将商品信息传到次方法
		//.......
		
		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		//返回一个成功页面
		modelAndView.setViewName("success");
		
		return modelAndView;
		

	}

}
