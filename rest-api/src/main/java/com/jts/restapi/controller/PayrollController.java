package com.jts.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PayrollController {

	@GetMapping("/getEmpDetails")
	public String getEmpDetails() {
		return "Success";
	}
	
	@PostMapping("/save")
	public String postEmpDetails() {
		return "Success";
	}
}
