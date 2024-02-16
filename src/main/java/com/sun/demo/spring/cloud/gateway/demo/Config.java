package com.sun.demo.spring.cloud.gateway.demo;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
public class Config {

    @Bean
    ServletRegistrationBean<DemoServlet> demoServletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new DemoServlet(), "/demo");
    }

    @Bean
    FilterRegistrationBean<DemoFilter> demoFilterFilterRegistrationBean() {
        FilterRegistrationBean<DemoFilter> demoFilterFilterRegistrationBean = new FilterRegistrationBean<>(new DemoFilter());
        demoFilterFilterRegistrationBean.addUrlPatterns("/*");
        return demoFilterFilterRegistrationBean;
    }

}
