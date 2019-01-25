package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloWorld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String convertToUppercase(HttpServletRequest request, Model model) {
		String theName = "YO! " + request.getParameter("studentName").toUpperCase();
		
		model.addAttribute("message", theName);
		
		return "helloWorld";	
	}
	
	@RequestMapping("/processFormVersionThree")
	public String convertToUppercaseTwo(
			@RequestParam("studentName") String theName , Model model) {
		theName = "YO! V3 " + theName.toUpperCase();
		
		model.addAttribute("message", theName);
		
		return "helloWorld";	
	}
	
}
