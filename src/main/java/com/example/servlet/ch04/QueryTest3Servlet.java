package com.example.servlet.ch04;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest3")
public class QueryTest3Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>질의 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>GET 방식으로 요청되었습니다.</h1>");

        String name = request.getParameter("name");
        out.print("이름: " + name + "<br>");

        out.print("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>질의 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식으로 요청되었습니다.</h1>");

        request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        out.print("이름: " + name + "<br>");

        out.print("</body></html>");
        out.close();
    }
}
