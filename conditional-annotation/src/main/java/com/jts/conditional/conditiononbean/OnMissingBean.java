package com.jts.conditional.conditiononbean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(MissingBean.class)
public class OnMissingBean {

}
