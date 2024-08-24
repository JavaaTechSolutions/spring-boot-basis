package com.jts.spring_boot_basic.bean.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
public class RequestScopeBean {

	private String name = "Request Scope";

	public RequestScopeBean() {
		System.out.println("Request scope Constructor Called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
