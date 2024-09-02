package kr.edu.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InfoControlooer {
	
//	@RequestMapping(value = "/info", method = RequestMethod.GET)
	@RequestMapping("/info")
	public String info(Model modle) {
		
		String phone = "010-1234-5687";
		
		modle.addAttribute("phone",phone);
		modle.addAttribute("name","최태형");
		
		return "info";
	}
}
