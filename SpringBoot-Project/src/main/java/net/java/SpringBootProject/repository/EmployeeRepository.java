package net.java.SpringBootProject.repository;

import net.java.SpringBootProject.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository <Employee, Long>{
    // all crud databases method
}


