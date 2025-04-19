package com.example.servlet.ch06_4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionTest")
public class SessionTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String param = request.getParameter("p");
        String msg = null;
        HttpSession session = null;

        if (param.equals("create")) {
            session = request.getSession();
            if (session.isNew()) {
                msg = "새로운 세션 객체 생성";
            } else {
                msg = "기존의 세션 객체 리턴";
            }
        } else if (param.equals("delete")) {
            session = request.getSession(false);
            if (session != null) {
                session.invalidate();
                msg = "세션 객체 삭제 작업 완료";
            } else {
                msg = "삭제할 세션 객체 존재하지 않음";
            }
        } else if (param.equals("add")) {
            session = request.getSession(true);
            session.setAttribute("msg", "메시지입니다");
            msg = "세션 객체에 데이터 등록 완료";
        } else if (param.equals("get")) {
            session = request.getSession(false);
            if (session != null) {
                String str = (String) session.getAttribute("msg");
                msg = str;
            } else {
                msg = "데이터를 추출할 세션 객체 존재하지 않음";
            }
        } else if (param.equals("remove")) {
            session = request.getSession(false);
            if (session != null) {
               session.removeAttribute("msg");
               msg = "세션 객체의 데이터 삭제 완료";
            } else {
                msg = "데이터를 삭제할 세션 객체 존재하지 않음";
            }
        } else if (param.equals("replace")) {
            session = request.getSession();
            session.setAttribute("msg", "새로운 메시지입니다");
            msg = "세션 객체에 새로운 데이터 등록 완료";
        }

        out.print("처리결과: " + msg);
        out.close();
    }
}
