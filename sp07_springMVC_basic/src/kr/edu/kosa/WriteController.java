package kr.edu.kosa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WriteController {
	@RequestMapping(value = "write.do", method = RequestMethod.POST)
	 public ModelAndView write(
		        @RequestParam("name") String name,
		        @RequestParam("content") String content,
		        @RequestParam("title") String title
		    ) {
		        ModelAndView mav = new ModelAndView();
		        
		        System.out.println("Name : " + name);
		        System.out.println("title : " + title);
		        System.out.println("Content : " + content);

		        mav.addObject("name", name);
		        mav.addObject("title",title);
		        mav.addObject("content", content);

		        mav.setViewName("writePro"); 

		        return mav;
		    }
}
