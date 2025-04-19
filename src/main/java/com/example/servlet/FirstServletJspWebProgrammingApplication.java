package com.example.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan	// 서블릿, 필터, 리스너 자동 스캔 활성화
public class FirstServletJspWebProgrammingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstServletJspWebProgrammingApplication.class, args);
	}

}