package com.example.servlet.ch07_2;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

//@WebListener
public class TestHttpSessionListener implements HttpSessionListener {

    public TestHttpSessionListener() {
        System.out.println("[Listener] TestHttpSessionListener 객체 생성");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("[Listener] 세션 생성 - HttpSession 초기화");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("[Listener] 세션 종료 - HttpSession 해제");
    }
}
