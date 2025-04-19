package com.example.servlet.ch03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>요청 방식과 프로토콜 정보</h3>");

        out.print("Request URI: " + request.getRequestURI() + "<br>");
        out.print("Request URL: " + request.getRequestURL() + "<br>");
        out.print("Context Path: " + request.getContextPath() + "<br>");
        out.print("Request Protocol: " + request.getProtocol() + "<br>");
        out.print("Servlet Path: " + request.getServletPath() + "<br>");

        out.print("</body></html>");
        out.close();
    }
}
