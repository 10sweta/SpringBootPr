package net.java.SpringBootProject;

import net.java.SpringBootProject.model.Employee;
import net.java.SpringBootProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Sweta");
		employee.setLastName("Zope");
		employee.setEmailid("sweta10@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Siya");
		employee1.setLastName("Kandekar");
		employee1.setEmailid("siyakandekar10.@gmail.com");
		employeeRepository.save(employee1);

	}
}
