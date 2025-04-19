package com.example.servlet.ch04;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/queryTest2")
public class QueryTest2Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>질의 문자열 테스트</title></head>");
        out.print("<body>");
        out.print("<h1>POST 방식 전체 질의 문자열</h1>");

        ServletInputStream input = request.getInputStream();
        int len = request.getContentLength();
        byte[] buf = new byte[len];
        input.readLine(buf, 0, len);
        String str = new String(buf);
        out.print("전체 질의 문자열: " + str);

        out.print("</body></html>");
        out.close();
    }
}
