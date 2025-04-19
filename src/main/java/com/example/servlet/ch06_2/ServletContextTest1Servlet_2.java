package com.example.servlet.ch06_2;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context12")
public class ServletContextTest1Servlet_2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        ServletContext sc = this.getServletContext();
        //String location = sc.getInitParameter("contextConfig");             // web.xml 사용 시
        String location = (String) sc.getAttribute("contextConfig");    // @WebListener 사용으로 대체
        out.print("location: " + location);
        out.close();
    }
}


