package cn.itcast.xc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		//创建准备返回的ModelAndView对象
		ModelAndView mav=new ModelAndView();
		//添加模型数据，可以是任意的pojo对象
		mav.addObject("message","Hello World!");
		//设置逻辑视图名，视图解析器会根据该名字解析到具体的视图页面
		mav.setViewName("/WEB-INF/content/welcome.jsp");
		return mav;
	}

}
