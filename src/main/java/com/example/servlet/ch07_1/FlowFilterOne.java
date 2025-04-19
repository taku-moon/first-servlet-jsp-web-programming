package com.example.servlet.ch07_1;

import jakarta.servlet.*;

import java.io.IOException;

//@WebFilter("/fourth")
public class FlowFilterOne implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FlowFilterOne init() 호출 ... /fourth");
    }

    @Override
    public void destroy() {
        System.out.println("FlowFilterOne destroy() 호출 ... /fourth");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FlowFilterOne doFilter() 호출 전 ... /fourth");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("FlowFilterOne doFilter() 호출 후 ... /fourth");
    }
}
