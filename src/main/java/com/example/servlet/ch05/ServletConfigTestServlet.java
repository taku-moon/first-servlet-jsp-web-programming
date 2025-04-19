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
        <servlet-name>servletConfigTest</servlet-name>
        <servlet-class>com.example.servlet.ch05.ServletConfigTestServlet</servlet-class>
        <init-param>
            <param-name>charset</param-name>
            <param-value>UTF-8</param-value>
        </init-param>
    </servlet>

    <servlet-mapping>
        <servlet-name>servletConfigTest</servlet-name>
        <url-pattern>/servletConfigTest</url-pattern>
    </servlet-mapping>
*/

@WebServlet(name = "servletConfigTest",
            initParams = @WebInitParam(name = "charset", value = "UTF-8"),
            urlPatterns = "/servletConfigTest"
)
public class ServletConfigTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.print("<h2>서블릿 초기 변수 추출 (방법 2)</h2>");
        String env1 = getInitParameter("charset");
        //String env1 = this.getInitParameter("charset");
        //String env1 = getServletConfig().getInitParameter("charset");
        request.setCharacterEncoding(env1);
        out.print("<h3>이름: " + request.getParameter("name") + "</h3>");

        out.close();
    }
}
