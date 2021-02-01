package com.capgemini.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="employee")
public class Employee {
	
	@Column(name="ename" ,length=20,nullable=false) 
	private String name;
	
	@Id   //denoting primary key of the table.
	private int id;
	 
	public Employee() {
		super();
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	

}
