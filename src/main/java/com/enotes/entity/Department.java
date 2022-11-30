package com.enotes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.*; 


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
	@Id 
	@GeneratedValue
  private Integer id;
  private String  name;
  
  @OneToMany(mappedBy="department")
  private List<Employee> employees;
  
  

}




	
	