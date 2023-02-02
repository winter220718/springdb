package com.ezen.springdb.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Integer department_id;
	private String job_id;

}
