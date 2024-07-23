package com.jts.conditional.conditiononproperty;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(
		value = "is.enable",
		havingValue = "true",
		matchIfMissing = true
		)
public class PropertyConfiguration {

}
