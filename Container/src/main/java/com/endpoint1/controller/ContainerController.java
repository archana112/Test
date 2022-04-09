package com.endpoint1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/bookings/")
public class ContainerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping
	public Boolean getAvailableSpace() {		
		 Integer availableSpace = this.restTemplate.getForObject("https://maersk.com/api/bookings/checkAvailabile", Integer.class);	 
		 
		 if(availableSpace>0)		 
			 return true;
		 else
			 return false;
	}	

}
