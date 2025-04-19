package com.example.servlet.ch07_1;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter(filterName = "timer", urlPatterns = "/fifth")
public class FlowFilterThree implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FlowFilterThree init() 호출 ... /fifth");
    }

    @Override
    public void destroy() {
        System.out.println("FlowFilterThree destroy() 호출 ... /fifth");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long startTime = System.currentTimeMillis();
        System.out.println("FlowFilterThree doFilter() 호출 전 ... /fifth");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("FlowFilterThree doFilter() 호출 후 ... /fifth");
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        System.out.println("수행시간: " + executeTime + "ms");
    }
}
