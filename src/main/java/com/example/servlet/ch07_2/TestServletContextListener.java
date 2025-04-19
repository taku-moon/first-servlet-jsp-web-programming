package com.example.servlet.ch07_2;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

//@WebListener
public class TestServletContextListener implements ServletContextListener {

    public TestServletContextListener() {
        System.out.println("[Listener] TestServletContextListener 객체 생성");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("[Listener] 웹 애플리케이션 시작 - ServletContext 초기화");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("[Listener] 웹 애플리케이션 종료 - ServletContext 해제");
    }
}
