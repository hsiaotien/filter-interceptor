package com.coinceres.component.filterinterceptor.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Filter配置有多种设置方式
 */
public class SecondFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("second Filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("second doFilter before");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("second doFilter after");

    }

    @Override
    public void destroy() {
        System.out.println("second Filter destory");
    }
}
