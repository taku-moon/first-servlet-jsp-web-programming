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

/**  web.xml
     <servlet>
        <servlet-name>initParam</servlet-name>
        <servlet-class>com.example.servlet.ch05.InitParamServlet</servlet-class>
        <init-param>
            <param-name>id</param-name>
            <param-value>guest</param-value>
        </init-param>
        <init-param>
            <param-name>pw</param-name>
            <param-value>1234</param-value>
        </init-param>
        <load-on-startup>1</load-on-startup>
    </servlet>

    <servlet-mapping>
        <servlet-name>initParam</servlet-name>
        <url-pattern>/initParamTest</url-pattern>
    </servlet-mapping>
*/

@WebServlet(
        name = "initParam",
        initParams = {
                @WebInitParam(name = "id", value = "guest"),
                @WebInitParam(name = "pw", value = "1234")
        },
        loadOnStartup = 1,
        urlPatterns = "/initParamTest"
)
public class InitParamServlet extends HttpServlet {
    String id;
    String pw;

    @Override
    public void init(ServletConfig config) throws ServletException {
        id = config.getInitParameter("id");
        pw = config.getInitParameter("pw");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<h2>서블릿 초기 변수 추출 (방법 1)</h2>");
        out.print("<h3>ID: " + id + "</h3>");
        out.print("<h3>PW: " + pw + "</h3>");

        out.close();
    }
}
