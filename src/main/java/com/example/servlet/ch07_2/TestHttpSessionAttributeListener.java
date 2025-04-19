package com.example.servlet.ch07_2;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

//@WebListener
public class TestHttpSessionAttributeListener implements HttpSessionAttributeListener {

    public TestHttpSessionAttributeListener() {
        System.out.println("[Listener] TestHttpSessionAttributeListener 객체 생성");
    }

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("[Listener] 세션 속성 추가 - " + event.getName() + " = " + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("[Listener] 세션 속성 제거 - " + event.getName());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("[Listener] 세션 속성 교체 - " + event.getName());
    }
}
