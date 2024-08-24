package com.jts.spring_boot_basic.bean.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BeanScopeController {

	@Autowired
	private CombinedScopeService scopeService;

	@GetMapping("/request-scope")
	public String requestScope() {
		return scopeService.getRequestScope().getName();
	}
	
	@GetMapping("/session-scope")
	public String sessionScope() {
		return scopeService.getSessionScope().getName();
	}
}
