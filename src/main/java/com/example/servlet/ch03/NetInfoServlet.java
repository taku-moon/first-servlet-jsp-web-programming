package com.example.servlet.ch03;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=EUC-KR");

        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Request 정보 출력 Servlet</title></head>");
        out.print("<body>");
        out.print("<h3>네트워크 관련 요청 정보</h3>");

        out.print("Request Scheme: " + request.getScheme() + "<br>");
        out.print("Server Name: " + request.getServerName() + "<br>");
        out.print("Server Address: " + request.getLocalAddr() + "<br>");
        out.print("Server Port: " + request.getServerPort() + "<br>");
        out.print("Client Address: " + request.getRemoteAddr() + "<br>");
        out.print("Client Host: " + request.getRemoteHost() + "<br>");
        out.print("Client Port: " + request.getRemotePort() + "<br>");

        out.print("</body></html>");
        out.close();
    }
}
