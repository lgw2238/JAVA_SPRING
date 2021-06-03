package spring_web04;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller, Hello {


	String name;


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String sayHello() {
		// TODO Auto-generated method stub
		return "어서오세요        " + name + "님";
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg", sayHello());
		mav.setViewName("hello");
		return mav;
	}





}
