package com.coinceres.component.filterinterceptor.filter02;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Filter配置有多种设置方式（推荐第一种方式，可以指定order）
 * 第二种：
 * 注意：
 * @WebFilter这个注解并没有指定执行顺序的属性，其执行顺序依赖于Filter的名称，
 * 是根据Filter类名（注意不是配置的filter的名字）的字母顺序倒序排列，
 * 并且@WebFilter指定的过滤器优先级都高于FilterRegistrationBean配置的过滤器。
 * 有兴趣的朋友可以自己实验一下。
 */
//@WebFilter(urlPatterns = "/*",filterName = "threeFilter")
public class ThreeFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("three Filter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("three doFilter before");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("three doFilter after");

    }

    @Override
    public void destroy() {
        System.out.println("three Filter destory");
    }
}
