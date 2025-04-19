package com.example.servlet.ch06_4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/logProc")
public class LogInOutServlet extends HttpServlet {

    // 로그인
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("id");
        String pw = request.getParameter("pw");

        // 유효성 검사
        if (id.isEmpty() || pw.isEmpty()) {
            out.print("ID 또는 PW를 입력해주세요.");
            return;
        }

        HttpSession session = request.getSession();
        // 로그인 상태인지 판단
        if (session.isNew() || session.getAttribute("id") == null) {
            session.setAttribute("id", id);
            out.print("로그인 성공 :)");
        } else {
            out.print("현재 로그인 상태입니다.");
        }

        out.close();
    }

    // 로그아웃
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        // 로그인 상태인지 판단
        if (session != null && session.getAttribute("id") != null) {
            session.invalidate();
            out.print("로그아웃 성공 :)");
        } else {
            out.print("현재 로그인 상태가 아닙니다.");
        }

        out.close();
    }
}
