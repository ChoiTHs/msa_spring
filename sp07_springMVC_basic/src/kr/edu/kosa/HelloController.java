package kr.edu.kosa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		
		//ModelAndView : 데이터 저장, 이동할 뷰 페이지 등록
		ModelAndView  mav = new ModelAndView();
		
		String tel = "010-9872-0202";
		
		//1. data save
		mav.addObject("nickname", "왕의미소");  
		mav.addObject("phone", tel);  
		
		//2. move view page
//		mav.setViewName("/WEB-INF/views/hello.jsp");
		
		mav.setViewName("hello");   //   /WEB-INF/views/ + hello + .jsp
		
		return mav;
	}

}
