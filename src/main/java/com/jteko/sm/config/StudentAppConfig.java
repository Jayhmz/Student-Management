package com.jteko.sm.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.jteko" })
public class StudentAppConfig {

	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	@Bean
	JdbcTemplate jdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate(datasource());
		return template;
	}

	@Bean
	DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUsername("root");
		datasource.setPassword("");
		datasource.setUrl("jdbc:mysql://localhost:3306/students?useSSL=false&serverTimezone=CET");
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");

		return datasource;
	}

}
