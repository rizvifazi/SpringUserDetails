package com.pack.SpringUserDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pack.SpringUserDetails.UserConfig;

@Controller
public class UserController {
	
	@Autowired
	private UserConfig config;
	
	@GetMapping("/user")
	public String getUser(Model model) {
		model.addAttribute("fname", config.getFname());
		model.addAttribute("lname", config.getLname());
		model.addAttribute("age", config.getAge());
		model.addAttribute("gender", config.getGender());
		model.addAttribute("city", config.getCity());
		return "index";
	}

}
