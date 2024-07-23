package com.jts.conditional.conditiononbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnBean(SuperBean.class)
public class DependentBean {

}
