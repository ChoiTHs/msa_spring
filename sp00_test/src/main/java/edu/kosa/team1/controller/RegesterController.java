package edu.kosa.team1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import edu.kosa.team1.model.IMemberDAO;

@Controller
@RequestMapping("join.test")
public class RegesterController {

	@Autowired
	private IMemberDAO iMemberDAO;
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "joinform";    //   /WEB-INF/views/+ loginForm + .jsp
	}
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@RequestParam(value = "id")String id, @RequestParam(value = "passwd")String passwd,@RequestParam(value = "name")String name,@RequestParam(value = "jumin1")String jumin1,@RequestParam(value = "jumin2")String jumin2,HttpSession session) {
		
		iMemberDAO.regester(id, passwd, name, jumin1, jumin2);
		
		return "loginform";
	}
}
