package com.endpoint2.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Containers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long containerId;
	
	@Column(name="containerSize",length = 40)
	private int containerSize;
	
	@Column(name="destination",length = 20)
	private String destination;
	
	@Column(name="quantity",length = 100)
	private int quantity;
	
	@Column(name="origin",length = 20)
	private String origin;
	
	public Long getContainerId() {
		return containerId;
	}
	public void setContainerId(Long containerId) {
		this.containerId = containerId;
	}
	public int getContainerSize() {
		return containerSize;
	}
	public void setContainerSize(int containerSize) {
		this.containerSize = containerSize;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

	
	

}
