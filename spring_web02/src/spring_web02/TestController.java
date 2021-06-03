package spring_web02;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		ModelAndView mav = new ModelAndView();
		
		// 모델은 변수에 담아서 보내야함
		mav.addObject("test", "추후에 변수처리가 되어서 전달된 데이터 ");///data (model)
		mav.setViewName("hi"); // view name
		
		
		return mav;
	}
       
	
	
}
