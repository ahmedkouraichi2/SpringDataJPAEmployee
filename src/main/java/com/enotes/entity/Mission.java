package com.enotes.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Mission {
	
	@Id
	@GeneratedValue
	private Integer id;
	 
	private String  name;
	
	private int duration ;
	

	@ManyToMany(mappedBy="missions")
	private List<Employee> employess;

}
