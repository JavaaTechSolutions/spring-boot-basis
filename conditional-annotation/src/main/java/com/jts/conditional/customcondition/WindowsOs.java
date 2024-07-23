package com.jts.conditional.customcondition;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(OnWindowsOrUnixCondition.class)
class WindowsOs {

}