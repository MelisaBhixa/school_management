/**
 EmployeeRepository.java
 Repository class for the Employee
 Author: Legiste Ndabashinze (217046207)
 Date: 14 June 2022
 */
package za.ac.cput.repository.users.impl;

import za.ac.cput.domain.lookup.EmployeeAddress;
import za.ac.cput.domain.users.Employee;
import za.ac.cput.repository.users.IEmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeRepository implements IEmployeeRepository {

    private final List<Employee> employeeList;
    private static EmployeeRepository EMPLOYEE_REPOSITORY;

    public static EmployeeRepository employeeRepository(){
        if (EMPLOYEE_REPOSITORY == null)
            EMPLOYEE_REPOSITORY = new EmployeeRepository();
        return EMPLOYEE_REPOSITORY;
    }

    private EmployeeRepository(){
        this.employeeList = new ArrayList<>();
    }

    @Override
    public Employee save(Employee employee) {
        Optional <Employee> read = read(employee.getStaffId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeList.add(employee);
        return employee;
    }

    @Override
    public Optional <Employee> read(String staffId) {
        return this.employeeList.stream()
                .filter(employeeAddress -> employeeAddress.getStaffId()
                        .equalsIgnoreCase(staffId)).findFirst();
    }

    @Override
    public Employee update(Employee employee) {
        Optional<Employee> read = read(employee.getStaffId());

        if (read.isPresent()){
            Employee updated = new Employee.EmployeeBuilder()
                    .copy(employee)
                            .setStaffId(employee.getStaffId())
                                    .setEmail(employee.getEmail())
                                            .setName(employee.getName())
                                                    .build();

            delete(employee);
            this.employeeList.add(updated);
        }
        return employee;
    }

    @Override
    public void delete(Employee employee) {
        this.employeeList.remove(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public List<Employee> findByStaffId(String staffId) {
        return this.employeeList.stream()
                .filter(employee -> employee.getStaffId()
                        .equalsIgnoreCase(staffId))
                .collect(Collectors.toList());
    }
}
