package com.example.servlet.ch05;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name = "initParamServletConfigTest",
        initParams = {
                @WebInitParam(name = "id", value = "admin"),
                @WebInitParam(name = "pw", value = "q1w2e3")
        },
        loadOnStartup = 1,
        urlPatterns = "/initParamServletConfigTest"
)
public class InitParamServletConfigTestServlet extends HttpServlet {
    String id;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);    // 이 코드가 꼭 있어야 함
        id = config.getInitParameter("id");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<h2>서블릿 초기 변수 추출 (방법 1 + 방법 2)</h2>");
        out.print("<h3>ID: " + id + "</h3>");
        out.print("<h3>PW: " + getInitParameter("pw") + "</h3>");

        out.close();
    }
}
