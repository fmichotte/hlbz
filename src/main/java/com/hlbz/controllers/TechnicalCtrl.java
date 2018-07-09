package com.hlbz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/technical")
public class TechnicalCtrl {
	
	
	@GetMapping("/list")
	public String listCustomers(Model theModel) {
		
		
		return "technical-list";
	}


}
