package com.example.servlet.ch06_5;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bookOutput")
public class BookTest2Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        Book book = (Book) request.getAttribute("book");

        out.print("<h3>제목: " + book.getTitle() + "</h3>");
        out.print("<h3>저자: " + book.getAuthor() + "</h3>");
        out.print("<h3>출판사: " + book.getPublisher() + "</h3>");
        out.close();
    }
}
