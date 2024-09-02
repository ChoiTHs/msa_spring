package edu.kosa.team1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.kosa.team1.model.IMemberDAO;

@Controller
@RequestMapping("/login.test")
public class LoginController {
	
	@Autowired
	private IMemberDAO iMemberDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "loginform";    //   /WEB-INF/views/+ loginForm + .jsp
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@RequestParam(value = "id") String id,
					   	 @RequestParam(value = "password") String pwd,
					   	 HttpSession session    // session 객체를 얻기
						) throws Exception {
		
		String viewPage = null;
		System.out.println("viewPage선언");
		boolean isMember = iMemberDAO.isMember(id, pwd);
		System.out.println("ismember : "+isMember);
		if( isMember ) {
			session.setAttribute("id", id);   // data save
			viewPage = "login";   //    /WEB-INF/views/+ loginSuccess + .jsp
		} else {
			viewPage = "loginform";
		}
		
		return viewPage;
	}
}












