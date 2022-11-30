package com.enotes.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
public class Employee {
	
	@Id 
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false )
	private String identifier;
	
	
	@Column(nullable = false  )
	private String firstname;
	
	
	@Column(nullable = false )
	private String lastname;
	
	
	@Column(nullable = false) 
	private String email ;
	
	
	@Column(nullable = false , unique = true )

	private LocalDate birthdate;
	
	@Enumerated(EnumType.STRING)
	private EmployeeRole role;
	
	
	@OneToOne
	@JoinColumn(name="adress_id")
	private Adress address;
	
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department  department;
	
	
	@ManyToMany
	@JoinTable(
			name="employee_mission",
			joinColumns = @JoinColumn (name="employee_id"),
			inverseJoinColumns = @JoinColumn (name ="mission_id")
			 )
	private List<Mission> missions ;

	
	
	
	
	
	
	
	

}
