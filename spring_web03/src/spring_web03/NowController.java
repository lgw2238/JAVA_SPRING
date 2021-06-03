package spring_web03;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class NowController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		// 현재시간을 가져와 Date형으로 저장한다
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMdd - HH:mm:ss");
		
		
		String time = sdf.format(d);
//		Date now = new Date(System.currentTimeMillis()); 
		
		//변수담기
		ModelAndView mav = new ModelAndView();
	
		
		mav.addObject("time", time);///data (model)
		mav.setViewName("now"); // view name
		
		
		
		return mav;
	}
}
