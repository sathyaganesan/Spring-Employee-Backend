package com.employeemanagement.springbootemployee;

import com.employeemanagement.springbootemployee.model.Employee;
import com.employeemanagement.springbootemployee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootEmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

	}
}
