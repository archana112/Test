package com.endpoint2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.endpoint2.entity.Containers;
import com.endpoint2.service.ContainerService;

@RestController
@RequestMapping("/api/bookings/")
public class ReceiverController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ContainerService containerService;
	
	@PostMapping("/{containerId}")
	public String getAvailableSpace(@PathVariable("containerId") Long id) {	
		Containers c = this.containerService.getContainer(id);	
		 String ContainerService = this.restTemplate.getForObject("http://CONTAINER-SERVICE/api/bookings/", String.class);
		return ContainerService;	 
		 
	}	
}
