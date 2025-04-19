package com.example.servlet.ch06_5;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/portalSite")
public class SendRedirectTestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = request.getParameter("site");

        if (param.equals("naver")) {
            response.sendRedirect("https://www.naver.com");
        } else if (param.equals("daum")) {
            response.sendRedirect("https://www.daum.net");
        } else if (param.equals("zum")) {
            response.sendRedirect("https://zum.com/");
        } else if (param.equals("google")) {
            response.sendRedirect("https://www.google.com");
        }

        /** response.sendRedirect(String location)
         * location으로 설정된 자원으로 요청을 재지정
         */

        /** response.encodeRedirectURL(String url)
         * url 문자열에 세션 ID 정보를 추가하여 요청을 재지정
         */
    }
}
