package com.jts.conditional.conditiononjavaversion;

import org.springframework.boot.autoconfigure.condition.ConditionalOnJava;
import org.springframework.boot.system.JavaVersion;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnJava(JavaVersion.SEVENTEEN)
public class OnJavaModule {

}
