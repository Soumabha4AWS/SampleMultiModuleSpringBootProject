package com.multi.module.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {
		"com.multi.module.springboot.controller", 
		"com.multi.module.springboot.entity",
		"com.multi.module.springboot.service",
		"com.multi.module.springboot.repository"
		})
@EntityScan(basePackages = {
		"com.multi.module.springboot.controller", 
		"com.multi.module.springboot.entity",
		"com.multi.module.springboot.service",
		"com.multi.module.springboot.repository"
		})
@EnableJpaRepositories(basePackages = {
		"com.multi.module.springboot.controller", 
		"com.multi.module.springboot.entity",
		"com.multi.module.springboot.service",
		"com.multi.module.springboot.repository"
		})

public class SampleMultiModuleSpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleMultiModuleSpringBootProjectApplication.class, args);
	}
}