package com.example.servlet.ch05;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/local")
public class LocalTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int number = 0;
        String str = request.getParameter("msg");

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.print("<html><head><title>MultiThread Test</title></head>");
        out.print("<body><h2>처리 결과 (지역 변수)</h2>");
        while (number++ < 10) {
            out.print(str + ": " + number + "<br>");
            out.flush();
            System.out.println(str + ": " + number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        out.print("<h2>Done " + str + "!!</h2>");
        out.print("</body></html>");
        out.close();
    }
}
