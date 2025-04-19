package com.example.servlet.ch02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("SecondServlet doGet() 실행");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Test</title></head>");
        out.print("<body><h1>Hava a nice day :)</h1></body>");
        out.print("</html>");
        out.close();
    }
}
