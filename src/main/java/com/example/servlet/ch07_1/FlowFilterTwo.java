package com.example.servlet.ch07_1;

import jakarta.servlet.*;

import java.io.IOException;

/**  web.xml
     <filter>
        <filter-name>flow2</filter-name>
        <filter-class>com.example.servlet.ch07.FlowFilterTwo</filter-class>
        <init-param>
            <param-name>en</param-name>
            <param-value>UTF-8</param-value>
        </init-param>
     </filter>

     <filter-mapping>
        <filter-name>flow2</filter-name>
        <url-pattern>/*</url-pattern>
     </filter-mapping>
*/

//@WebFilter(
//        filterName = "flow2",
//        initParams = @WebInitParam(name = "en", value = "UTF-8")
//        //urlPatterns = "/*"
//)
public class FlowFilterTwo implements Filter {
    String charsetValue;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FlowFilterTwo init() 호출 ... /*");
        charsetValue = filterConfig.getInitParameter("en");
    }

    @Override
    public void destroy() {
        //System.out.println("FlowFilterTwo destroy() 호출 ... /*");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletResponse.setContentType("text/html;charset=" + charsetValue);  // 여기서 처리
        System.out.println("FlowFilterTwo doFilter() 호출 전 ... /*");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("FlowFilterTwo doFilter() 호출 후 ... /*");
    }
}
