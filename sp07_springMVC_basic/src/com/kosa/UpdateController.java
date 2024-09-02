package com.kosa;

import java.net.Authenticator.RequestorType;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UpdateController {
	
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Model model) {
		String name = "강감찬";
		model.addAttribute("name",name);
		model.addAttribute("update", "Update Page입니다");
		
		return "update";
	}
//	@RequestMapping("/update.do")// <==value = "/update.do"
//	public ModelAndView update() {
//		ModelAndView mav = new ModelAndView();
//		
//		String name = "강감찬";
//		mav.addObject("name",name);
//		mav.addObject("update", "Update Page입니다");
//		
//		mav.setViewName("update");
//		
//		return mav;
//	}
}
