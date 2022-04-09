package com.endpoint2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.endpoint2.entity.Containers;

public class ContainerService {
	
	@Autowired
	Containers c;
	
	public Containers getContainer(Long id) {
		return c;
		// TODO Auto-generated method stub
	}

}
