package com.hlbz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hlbz.daos.TechnicalDAO;
import com.hlbz.entities.Technical;

@Controller
@RequestMapping("/technical")
public class TechnicalCtrl {
	
	
	@Autowired
	private TechnicalDAO technicalDAO;
	
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel) {
		
		List<Technical> list = technicalDAO.getTechnicals();

		theModel.addAttribute("LST", list);
		
		return "technical-list";
	}


}
