package com.example.servlet.ch07_3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/errorTest2")
public class ErrorTest2Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String queryString = request.getQueryString();
            out.print("Query: " + queryString + "<br>");                    // Null
            out.print("Query Length: " + queryString.length() + "<br>");    // NullPointerException
        } catch (NullPointerException e) {
            out.print("오류 발생: " + e + "<br>");
        } finally {
            out.close();
        }
    }
}
