package com.example.servlet.ch06_2;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/context3")
public class ServletContextTest3Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ServletContext sc = this.getServletContext();

        ShareObject obj1 = new ShareObject();
        obj1.setCnt(100);
        obj1.setStr("객체 공유 테스트 - 1");
        sc.setAttribute("data1", obj1);

        ShareObject obj2 = new ShareObject();
        obj2.setCnt(200);
        obj2.setStr("객체 공유 테스트 - 2");
        sc.setAttribute("data2", obj2);

        out.print("ServletContext 객체에 데이터 등록 완료");
        out.close();
    }
}
