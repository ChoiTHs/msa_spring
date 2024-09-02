package com.javassem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.service.ReplyServiceImpl;

@RestController
public class ReplyController {
	
	@Autowired
	ReplyServiceImpl  replyService;
	
	// 

}
