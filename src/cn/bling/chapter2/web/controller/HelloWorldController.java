package cn.bling.chapter2.web.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse; 
public class HelloWorldController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
	       //1���ռ���������֤����  
	       //2���󶨲������������  
	       //3�������������ҵ��������ҵ����  
	       //4��ѡ����һ��ҳ�� 
		ModelAndView mv = new ModelAndView();
		//���ģ������ �����������POJO����
		mv.addObject("message", "HelloWorld !!! Bling ������");
		//�����߼���ͼ������ͼ����������ݸ����ֽ������������ͼҳ��
		mv.setViewName("bling");
		return mv;
	}


}
