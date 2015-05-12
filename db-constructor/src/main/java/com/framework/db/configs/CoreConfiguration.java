package com.framework.db.configs;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@Import(DBConfig.class)
@ComponentScan({"com.framework.db"})
@PropertySource("classpath:core.properties")
public class CoreConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();
        pc.setIgnoreResourceNotFound(true);
        return pc;
    }
}
