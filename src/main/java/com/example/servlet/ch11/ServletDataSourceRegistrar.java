package com.example.servlet.ch11;

import com.mysql.cj.jdbc.MysqlDataSource;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ServletDataSourceRegistrar implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/firstservletjsp");
        dataSource.setUser("firstservletjsp-user");
        dataSource.setPassword("1234");

        sce.getServletContext().setAttribute("mysqlDataSource", dataSource);
    }
}
