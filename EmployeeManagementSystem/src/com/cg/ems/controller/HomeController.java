package com.cg.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.ems.bean.EmployeeBean;

@Controller
public class HomeController {


	@RequestMapping("/index")
	public String start(Model model){
		model.addAttribute("employee", new EmployeeBean());
		return "RegistrationForm";
	}
}
