package com.jsp.demospringjsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	@RequestMapping("/jsp")
	public String firstApi() {
		
//		System.out.println("yes I have created my second rest api");
		return "yes i have received my response back in postman";
	}
}
