package com.example.servlet.ch07_2;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

//@WebListener
public class TestServletRequestListener implements ServletRequestListener {

    public TestServletRequestListener() {
        System.out.println("[Listener] TestServletRequestListener 객체 생성");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("[Listener] 클라이언트 요청 시작 - ServletRequest 초기화");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("[Listener] 클라이언트 요청 종료 - ServletRequest 해제");
    }
}
