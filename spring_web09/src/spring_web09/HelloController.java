package spring_web09;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller       // mvc1방식
public class HelloController {

		@RequestMapping(value = "/hello1.do")
		public ModelAndView hello(HttpServletRequest req) {
			String data = req.getParameter("mav");
			return new ModelAndView("hello1", "msg1", data);
		}
		
		//mvc2방식
		
		@RequestMapping(value = "/hello2.do")
		public String prt(HttpServletRequest req) {
			String data = req.getParameter("req");
			
			req.setAttribute("msg2", data);
			
			return "hello2";
		}
		
		
		
		
		
}
