package com.jts.spring_boot_basic.bean.scopes;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
//@RequestScope
//@SessionScope
public class SessionScopeBean {

	private String name = "Session Scope";

	public SessionScopeBean() {
		System.out.println("Session scope Constructor Called at " + LocalDateTime.now());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
