package com.example.servlet.ch06_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookie3")
public class CookieTest3Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int cnt = 0;
        Cookie[] list = request.getCookies();
        for (int i = 0; (list != null && i < list.length); i++) {
            if (list[i].getName().equals("count")) {
                cnt = Integer.parseInt(list[i].getValue());
            }
        }
        cnt++;

        Cookie c = new Cookie("count", String.valueOf(cnt));
        c.setMaxAge(60 * 60 * 24 * 10);
        response.addCookie(c);

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<h1>방문 횟수: " + cnt + "</h1>");
        out.close();
    }
}
