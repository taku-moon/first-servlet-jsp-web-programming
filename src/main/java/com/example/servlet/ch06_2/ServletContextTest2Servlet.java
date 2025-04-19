package com.example.servlet.ch06_2;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context2")
public class ServletContextTest2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ServletContext sc = this.getServletContext();

        out.println("서블릿 버전: " + sc.getMajorVersion() + "." + sc.getMinorVersion() + "<br>");
        out.println("서버 정보: " + sc.getServerInfo() + "<br>");
        out.println("웹 애플리케이션 경로: " + sc.getContextPath() + "<br>");
        out.println("웹 애플리케이션 이름: " + sc.getServletContextName() + "<br>");
        out.println("파일 실제 경로: " + sc.getRealPath("/name.html"));
        sc.log("로그 기록 :)");

        out.close();
    }
}
