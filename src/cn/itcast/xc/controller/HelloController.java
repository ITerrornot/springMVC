package cn.itcast.xc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		
		//����׼�����ص�ModelAndView����
		ModelAndView mav=new ModelAndView();
		//���ģ�����ݣ������������pojo����
		mav.addObject("message","Hello World!");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mav.setViewName("/WEB-INF/content/welcome.jsp");
		return mav;
	}

}
