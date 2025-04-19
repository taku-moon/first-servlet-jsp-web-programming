package com.example.servlet.ch04;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest1")
public class QueryTest1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>질의 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>GET 방식으로 요청되었습니다.</h1>");

        out.print("ID: " + request.getParameter("id") + "<br>");
        out.print("PW: " + request.getParameter("pw") + "<br>");
        out.print("이름: " + request.getParameter("name") + "<br>");
        out.print("취미: ");
        for (String hobby : request.getParameterValues("hobby")) {
            out.print(hobby + " ");
        }
        out.print("<br>");
        out.print("성별: " + request.getParameter("gender") + "<br>");
        out.print("종교: " + request.getParameter("religion") + "<br>");
        out.print("소개: " + request.getParameter("introduction") + "<br>");
        out.print("전체 질의 문자열: " + request.getQueryString());

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

        out.print("ID: " + request.getParameter("id") + "<br>");
        out.print("PW: " + request.getParameter("pw") + "<br>");
        out.print("이름: " + request.getParameter("name") + "<br>");
        out.print("취미: ");
        for (String hobby : request.getParameterValues("hobby")) {
            out.print(hobby + " ");
        }
        out.print("<br>");
        out.print("성별: " + request.getParameter("gender") + "<br>");
        out.print("종교: " + request.getParameter("religion") + "<br>");
        out.print("소개: " + request.getParameter("introduction") + "<br>");
        out.print("전체 질의 문자열: " + request.getQueryString());   // null

        out.print("</body></html>");
        out.close();
    }
}
