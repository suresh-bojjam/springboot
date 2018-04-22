package com.example.models;

import org.springframework.stereotype.Service;

@Service
public class Item {
	
	private int empId;
	
	public Item() {
		
	}
	
	public Item(int empId) {
		this.empId=empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
}
