package com.example.product.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyPrometheusConfig {

//    @Bean
//    @ConditionalOnClass(name = "org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer")
//    MeterRegistryCustomizer<MeterRegistry> configurer(@Value("${spring.application.name") String applicationName){
//        return registry -> registry.config().commonTags("application", applicationName);
//    }
}
