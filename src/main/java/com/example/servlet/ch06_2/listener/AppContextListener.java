package com.example.servlet.ch06_2.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        /**  web.xml
             <context-param>
                 <param-name>contextConfig</param-name>
                 <param-value>/WEB-INF/context.xml</param-value>
             </context-param>
        */
        sc.setAttribute("contextConfig", "/WEB-INF/context.xml");
    }
}
