package com.jts.conditional.conditiononjavaversion;

import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnNotWebApplication
class OnNotWebApplicationModule {
}