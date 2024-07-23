package com.jts.conditional.conditiononresource;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConditionalOnResource(resources = "/logback.xml")
@ConditionalOnMissingClass(value = "com.jts.conditional.conditiononbean.MissingClass")
class LogbackModule {

}