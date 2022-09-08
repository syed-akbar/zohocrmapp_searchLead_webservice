package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.dto.Lead;
import com.zoho.service.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadservice;
	
	@RequestMapping("/search")
	public String searchOneLead() {
		return "search_lead";
		
	}
	
	@RequestMapping("/searchlead")
	public String search(@RequestParam("id")long id, ModelMap model) {
		Lead lead = leadservice.getOneLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}

}
