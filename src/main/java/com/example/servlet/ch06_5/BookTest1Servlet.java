package com.example.servlet.ch06_5;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/bookReg")
public class BookTest1Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String publisher = request.getParameter("publisher");

        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPublisher(publisher);

        request.setAttribute("book", book);

        // RequestDispatcher 객체를 생성하는 방법 2) ServletRequest 객체를 통해서 (절대경로 o, 상대경로 o)
        RequestDispatcher rd = request.getRequestDispatcher("/bookOutput");
        rd.forward(request, response);
    }
}
