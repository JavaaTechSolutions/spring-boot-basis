package com.jts.spring_boot_basic.bean.scopes;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanScopeMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(MyConfiguration.class);
		ctx.refresh();
		
		MyBean bean1 = ctx.getBean(MyBean.class);
		System.out.println(bean1.hashCode());
		
		MyBean bean2 = ctx.getBean(MyBean.class);
		System.out.println(bean2.hashCode());
		
		ctx.close();
	}
}
