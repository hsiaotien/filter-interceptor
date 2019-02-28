package com.coinceres.component.filterinterceptor.config;

import com.coinceres.component.filterinterceptor.filter.FirstFilter;
import com.coinceres.component.filterinterceptor.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Filter的配置有多种方式
 * 第一种配置方式
 */
@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean registFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new FirstFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("firstFilter");
        registrationBean.setOrder(1);
        return registrationBean;
    }


    @Bean
    public FilterRegistrationBean registFilter2() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new SecondFilter());
        registrationBean.addUrlPatterns("/*");
        registrationBean.setName("secondFilter");
        registrationBean.setOrder(2);
        return registrationBean;
    }
}
