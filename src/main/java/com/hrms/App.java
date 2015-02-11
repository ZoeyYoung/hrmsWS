package com.hrms;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.entity.Employee;
import com.hrms.repository.EmployeeRepository;

@ComponentScan
@Configuration
@Import(RepositoryRestMvcConfiguration.class)
@RestController
@EnableJpaRepositories
@EnableAutoConfiguration
public class App {
    @Bean
    CommandLineRunner init(EmployeeRepository employeeRepository) {
	return (evt) -> Arrays.asList(
	        "jhoeller,dsyer,pwebb,ogierke,rwinch,mfisher,mpollack,jlong".split(","))
	        .forEach(
	                a -> {
		            Employee account = employeeRepository.save(new Employee(a));
	                });
    }

    public static void main(String[] args) {
	SpringApplication.run(App.class, args);
    }

}
