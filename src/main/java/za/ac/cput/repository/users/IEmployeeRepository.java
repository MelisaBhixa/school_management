/**
 IEmployeeRepository.java
 Repository interface for the Employee
 Author: Legiste Ndabashinze (217046207)
 Date: 14 June 2022
 */
package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Employee;
import za.ac.cput.repository.IRepository;

import java.util.List;
import java.util.Set;

public interface IEmployeeRepository extends IRepository<Employee, String> {
    List<Employee> getAll();
    List<Employee> findByStaffId(String staffId);
}
