package com.example.servlet.ch07_3;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;

//@WebFilter("/*")
public class ErrorHandleFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        try {
            filterChain.doFilter(servletRequest, servletResponse);    // NullPointerException
        } catch (NullPointerException e) {
            // NullPointerException 발생 -> /errorHandle2로 포워딩
            servletRequest.setAttribute("exception", e);
            servletRequest.setAttribute("exceptionURI", ((HttpServletRequest) servletRequest).getRequestURI());
            servletRequest.getRequestDispatcher("/errorHandle2").forward(servletRequest, servletResponse);
        }

    }
}
