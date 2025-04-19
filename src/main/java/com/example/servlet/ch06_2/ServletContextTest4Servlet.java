package com.example.servlet.ch06_2;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context4")
public class ServletContextTest4Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ServletContext sc = this.getServletContext();

        ShareObject obj1 = (ShareObject) sc.getAttribute("data1");
        ShareObject obj2 = (ShareObject) sc.getAttribute("data2");

        out.print("data1: " + obj1.getCnt() + ", " + obj1.getStr() + "<br>");
        out.print("data2: " + obj2.getCnt() + ", " + obj2.getStr() + "<br>");
        out.close();
    }
}
