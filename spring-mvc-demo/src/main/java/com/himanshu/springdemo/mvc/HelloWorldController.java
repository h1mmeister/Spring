package com.himanshu.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// need to add a controller to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

}
