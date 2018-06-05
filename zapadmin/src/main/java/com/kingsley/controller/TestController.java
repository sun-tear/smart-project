package com.kingsley.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class TestController {

	@RequestMapping("/abc")
	@ResponseBody
	public String getAllUser(HttpServletRequest request){
		System.out.println("hello spring");
		return "{\"success\":\"success\"}";
		
		
		
		System.out.println(" test smartgit commit ");
		System.out.println("test commit 2 20");
		System.out.println("test conflict cosumer2 ");
		System.out.println("test commit 3 conflict cosumer2 ");
		
		System.out.println("test commit 4 conflict cosumer2 ");

		System.out.println("cosumer1  ≤‚ ‘smartgitÃ·Ωªgithub");
		
	}
}
