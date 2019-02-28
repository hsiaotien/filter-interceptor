package com.coinceres.component.filterinterceptor.config;

import com.coinceres.component.filterinterceptor.interceptor.TwoInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 也可以用order
 */
@Configuration
public class InterceptorConfig2 implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TwoInterceptor()).addPathPatterns("/test/two").order(1);
    }
}
