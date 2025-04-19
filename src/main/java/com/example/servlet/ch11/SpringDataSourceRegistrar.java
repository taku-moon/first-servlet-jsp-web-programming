package com.example.servlet.ch11;

import jakarta.annotation.PostConstruct;
import jakarta.servlet.ServletContext;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class SpringDataSourceRegistrar {

    private final DataSource dataSource;
    private final ServletContext servletContext;

    public SpringDataSourceRegistrar(DataSource dataSource, ServletContext servletContext) {
        this.dataSource = dataSource;
        this.servletContext = servletContext;
    }

    @PostConstruct
    public void register() {
        servletContext.setAttribute("springDataSource", dataSource);
    }
}
