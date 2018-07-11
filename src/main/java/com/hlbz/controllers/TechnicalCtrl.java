package com.hlbz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hlbz.entities.Technical;
import com.hlbz.services.TechnicalService;

@Controller
@RequestMapping("/technical")
public class TechnicalCtrl {
	
	
	@Autowired
	private TechnicalService technicalService;
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Technical> list = technicalService.getTechnicals();

		theModel.addAttribute("LST", list);
		
		return "technical-list";
	}


}
