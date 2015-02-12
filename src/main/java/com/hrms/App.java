package com.hrms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.entity.Account;
import com.hrms.entity.Employee;
import com.hrms.entity.FamilyInfo;
import com.hrms.repository.AccountRepository;
import com.hrms.repository.EmployeeRepository;
import com.hrms.repository.FamilyInfoRepository;

@ComponentScan
@Configuration
@Import(RepositoryRestMvcConfiguration.class)
@RestController
@EnableJpaRepositories
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
        EmployeeRepository employeeRepo = context.getBean(EmployeeRepository.class);
        FamilyInfoRepository familyInfoRepo = context.getBean(FamilyInfoRepository.class);
        AccountRepository accountRepository = context.getBean(AccountRepository.class);
        Employee employee1 = employeeRepo.save(new Employee("Employee1"));
        familyInfoRepo.save(new FamilyInfo(employee1, "Family11"));
        familyInfoRepo.save(new FamilyInfo(employee1, "Family12"));
        Employee employee2 = employeeRepo.save(new Employee("Employee2"));
        familyInfoRepo.save(new FamilyInfo(employee2, "Family21"));
        familyInfoRepo.save(new FamilyInfo(employee2, "Family22"));
        accountRepository.save(new Account("admin", "asdf1234"));
        accountRepository.save(new Account("user", "asdf1234"));
    }

}
