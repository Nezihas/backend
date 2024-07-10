package nezihas.example.securityapicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nezihas.example.securityapicrud.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
