package com.hlbz.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hlbz.entities.Technical;
import com.hlbz.services.TechnicalService;

@RestController
@RequestMapping("/rest")
public class TechnicalRestCtrl {
	
	@Autowired
	private TechnicalService techService;
	
	
	@PostMapping("/technical")
	public Technical addTechnical(@RequestBody Technical tech) {
		
		
		System.out.println("REST CALL - saveTechnical");
		
		tech.setId(0);
		techService.saveTechnical(tech);
		
		return tech;
	}


	@GetMapping("/technical/{technicalId}")
	public Technical getCustomer(@PathVariable int technicalId) {
		
		Technical tech = techService.getTechnical(technicalId);
		System.out.println("getTechnical : " + tech);
		
		return tech;
		
	}
	
	
	
	@DeleteMapping("/technical/{technicalId}")
	public String deleteCustomer(@PathVariable int technicalId) {
		
		Technical tech = techService.getTechnical(technicalId);
		if (tech != null) {
			techService.removeTechnical(tech);
		}
		
		return "";		
	}
	
	
	@PutMapping("/technical")
	public Technical updateCustomer(@RequestBody Technical tech) {
		
		Technical t = techService.getTechnical(tech.getId());
		if (t != null) {
			techService.saveTechnical(tech);
		}
		
		return tech;
	}

	
	
}
