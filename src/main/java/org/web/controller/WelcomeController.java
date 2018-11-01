package org.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	
	@RequestMapping(value ="/greeting")
	public String greet(Model model) {
		model.addAttribute("greeting", "Hello There");
		return "hello";
	}

}
