package com.jts.conditional.conditiononjavaversion;

import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform;
import org.springframework.boot.cloud.CloudPlatform;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnCloudPlatform(CloudPlatform.CLOUD_FOUNDRY)
class OnCloudPlatformModule {
}