package com.example.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

	@RequestMapping(value="/index")
	public String index(){
		System.out.println("----------------- home--->>> index ------------------");
		return "/index";
	}
	
}
