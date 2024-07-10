package nezihas.example.securityapicrud.services;

import java.util.List;

import org.springframework.stereotype.Repository;

import nezihas.example.securityapicrud.models.Employee;

@Repository
public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
