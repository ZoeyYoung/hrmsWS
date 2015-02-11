package com.hrms.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrms.entity.Employee;
import com.hrms.entity.Greeting;
import com.hrms.repository.EmployeeRepository;

@RestController
public class BaseController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @Autowired
    private EmployeeRepository employeeRepo;

    private void testData() {
        employeeRepo.save(new Employee("Employee1"));
        employeeRepo.save(new Employee("Employee2"));
    }

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public Greeting sayHello(@RequestParam(value = "name", required = false,
            defaultValue = "Stranger") String name) {
        testData();
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
