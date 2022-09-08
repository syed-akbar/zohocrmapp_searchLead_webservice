package com.zoho.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.zoho.dto.Lead;

@Service
public class LeadServiceImp implements LeadService {

	@Override
	public Lead getOneLead(long id) {
		RestTemplate rest = new RestTemplate();
		Lead lead = rest.getForObject("http://localhost:8080/api/lead/lead/"+id, Lead.class);
		return lead;
	}

}
