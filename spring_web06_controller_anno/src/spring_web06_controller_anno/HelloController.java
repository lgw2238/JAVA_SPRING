package spring_web06_controller_anno;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	
		//ModelAndView 객체 대신에 Model2방식을 사용할 수 있나 ? -mvc2방식:파일이름을 보냄
	@RequestMapping(value = "hello.do")
	public String sayHello(HttpServletRequest req) {
		
		String data = req.getParameter("data");
		
		req.setAttribute("data", data);
		
		return "hello";
	}
	
	
	
	
}
