package com.himanshu.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("/processFormTwo")
	public String showName(HttpServletRequest request, Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		theName = theName.toUpperCase();
		String result = "Hey " + theName;
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormThree")
	public String showName(@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		String result = "Hey there! " + theName;
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
