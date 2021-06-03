package kr.co.goott.control;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.goott.dto.MemberDTO;

@Controller
public class RegisterController {

	@RequestMapping(value = "/register/step1.do")
	public String processStep1() {
		return "step1";
		
		
	}
	
	@RequestMapping(value = "/register/step2.do")
	public String processStep2(HttpServletRequest req) {
		
		String ck = req.getParameter("ck");
		
		if(ck==null) {
			return "step1";
		}else {
			return "step2";
		}
		
		//return "step2";
	}
	
	@RequestMapping(value = "/register/step3.do") // annotation으로도 가능
	public String processStep3(
		//@RequestParam(value = "no", defaultValue = 0)int no, 형변환이 쉽게 됨	
			HttpServletRequest req
		
	) {
		
		
		// 랑 같은코드
      String id = req.getParameter("id");
	 String confirm = req.getParameter("confirm");
//		 String confirm = ---
//		 String email = ---
		
		
		MemberDTO dto = new MemberDTO();
		dto.setId(id);
		
		dto.setConfirm(confirm);
		//o.setEmail(email);
		
		// 사용자가 입력한 정보를 db에 등록
		//MysqlDAO dao = new MysqlDAO();
		//dao.insertOne(dto);
		
		req.setAttribute("dto", dto);

		
		
		return "welcome";
	}
//	
//	@RequestMapping(value = "/register/step3.do")
//	public String processStep3(@ModelAttribute() MemberDTO dto, Model model) {
//		
//		model.addAttribute("dto", dto);
//		
//		return "welcome";
//	}
	
	@RequestMapping(value = "/main")
	public String processStep4() {
		return "main";
	}
	
	
}
