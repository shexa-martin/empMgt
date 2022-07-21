package net.javaguides.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.javaguides.springboot.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//a method handler for Home page (index.html) to display a list of employees
	@GetMapping("/")
	public String viewHomePage(Model model) {
		//Spring boot auto configure view resolver for theme leaf
		model.addAttribute("listEmployees", employeeService.getAllEmployees());
		return "index";
	}

}
