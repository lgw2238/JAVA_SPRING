package spring_web06_controller_anno;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ViewMemberController  {

	@RequestMapping(value = "viewData1.do")
	public ModelAndView show(HttpServletRequest req) {
		return new ModelAndView("view", "message",  req.getParameter("message 나이따"));

	}

	@RequestMapping(value = "viewData2.do")
	public ModelAndView show2() {
	
		return new ModelAndView("view", "message2", "아프다~~ 행복해줘" );

	}
}

