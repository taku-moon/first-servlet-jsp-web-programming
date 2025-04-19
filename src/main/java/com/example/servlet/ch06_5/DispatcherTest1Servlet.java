package com.example.servlet.ch06_5;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/dispatcher1")
public class DispatcherTest1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Dispatcher Test1 실행");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("<h3>Dispatcher Test1의 수행 결과</h3>");

        // RequestDispatcher 객체를 생성하는 방법 1) ServletContext 객체를 통해서 (절대경로 o, 상대경로 x)
        RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/dispatcher2");
        rd.forward(request, response);      // 요청을 다른 자원으로 넘김
        //rd.include(request, response);    // 다른 자원의 처리 결과를 현재 페이지에 포함

        out.close();
    }
}
