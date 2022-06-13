/**
 Employee.java
 Entity for the Employee
 Author: Legiste Ndabashinze (217046207)
 Date: 12 June 2022
 */
package za.ac.cput.domain.users;

import javax.lang.model.element.Name;

public class Employee {
    private String staffId, email;
    private Name name;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.staffId = employeeBuilder.staffId;
        this.email = employeeBuilder.email;
        this.name = employeeBuilder.name;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getEmail() {
        return email;
    }

    public Name getName() {
        return name;
    }

    public static class EmployeeBuilder{

        private String staffId, email;
        private Name name;

        public EmployeeBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public EmployeeBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder setName(Name name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder copy(Employee employee){
            this.staffId = employee.staffId;
            this.email = employee.email;
            this.name = employee.name;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }
    }
}
