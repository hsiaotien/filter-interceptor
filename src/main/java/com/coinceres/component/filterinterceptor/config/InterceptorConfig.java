package com.coinceres.component.filterinterceptor.config;

import com.coinceres.component.filterinterceptor.interceptor.OneInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 使用了过时的方法
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new OneInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
