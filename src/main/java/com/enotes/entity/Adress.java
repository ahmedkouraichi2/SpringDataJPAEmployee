package com.enotes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Adress {
	
	@Id 
	@GeneratedValue
	
	private Integer id;
	private String streetName;
	private String houseNumber;
	private String zipCode;
	
	@OneToOne
	@JoinColumn(name="employee")
	private Employee employee;
	
	
	
}
 