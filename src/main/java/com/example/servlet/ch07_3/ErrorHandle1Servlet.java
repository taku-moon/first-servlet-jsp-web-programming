package com.example.servlet.ch07_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/errorHandle1")
public class ErrorHandle1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer code = (Integer) request.getAttribute("jakarta.servlet.error.status_code");
        String message = (String) request.getAttribute("jakarta.servlet.error.message");
        Throwable exception = (Throwable) request.getAttribute("jakarta.servlet.error.exception");
        Object type = request.getAttribute("jakarta.servlet.error.exception_type");
        String uri = (String) request.getAttribute("jakarta.servlet.error.request_uri");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.print("<h2>Error Code: " + code + "</h2>");
        out.print("<h2>Error Message: " + message + "</h2>");
        out.print("<h2>Error Object: " + exception + "</h2>");
        out.print("<h2>Error Type: " + type + "</h2>");
        out.print("<h2>Error URI: " + uri + "</h2>");
        out.close();
    }
}
