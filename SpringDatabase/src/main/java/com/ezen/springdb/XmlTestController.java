package com.ezen.springdb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.springdb.mapper.EmployeeXmlMapper;




@RequestMapping("/xml")
@Controller
public class XmlTestController {

	@Autowired
	EmployeeXmlMapper emp_mapper;
	
	
	@GetMapping("/employee/list")
	public String employeeList(Model model) {
	
		model.addAttribute("employees", emp_mapper.getAll());
		return "xml/emp_list";
		
	}
	
}
