package com.example.servlet.ch06_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie1")
public class CookieTest1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Cookie c1 = new Cookie("id", "guest");
        c1.setPath("/");
        response.addCookie(c1);

        Cookie c2 = new Cookie("code", "1234");
        c2.setMaxAge(60 * 60 * 3);
        c2.setPath("/");
        response.addCookie(c2);

        Cookie c3 = new Cookie("subject", "java");
        c3.setMaxAge(60 * 60 * 24 * 10);
        c3.setPath("/");
        response.addCookie(c3);

        out.print("쿠키 전송 완료");
        out.close();
    }
}
