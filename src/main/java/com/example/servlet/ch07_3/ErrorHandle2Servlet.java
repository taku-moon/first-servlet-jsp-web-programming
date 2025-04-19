package com.example.servlet.ch07_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/errorHandle2")
public class ErrorHandle2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 필터에서 넘긴 예외 객체 꺼내기
        Throwable exception = (Throwable) request.getAttribute("exception");
        String exceptionURI = (String) request.getAttribute("exceptionURI");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.print("<h2>Error Code: " + HttpServletResponse.SC_INTERNAL_SERVER_ERROR + "</h2>");
        out.print("<h2>Error Message: " + exception.getMessage() + "</h2>");
        out.print("<h2>Error Object: " + exception.getClass().getName() + "</h2>");
        out.print("<h2>Error Type: " + exception.getClass() + "</h2>");
        out.print("<h2>Error URI: " + exceptionURI + "</h2>");
        out.close();
    }
}
