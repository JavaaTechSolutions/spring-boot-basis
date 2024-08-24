package com.jts.spring_boot_basic.bean.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CombinedScopeService {

	@Autowired
	private RequestScopeBean requestScope;

	@Autowired
	private SessionScopeBean sessionScope;

	public RequestScopeBean getRequestScope() {
		return requestScope;
	}

	public void setRequestScope(RequestScopeBean requestScope) {
		this.requestScope = requestScope;
	}

	public SessionScopeBean getSessionScope() {
		return sessionScope;
	}

	public void setSessionScope(SessionScopeBean sessionScope) {
		this.sessionScope = sessionScope;
	}

}
