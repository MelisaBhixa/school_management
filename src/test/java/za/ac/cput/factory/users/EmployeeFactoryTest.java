/**
 EmployeeFactoryTest.java
 Factory test for the EmployeeFactory
 Author: Legiste Ndabashinze (217046207)
 Date: 13 June 2022
 */
package za.ac.cput.factory.users;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.userInfo.Name;
import za.ac.cput.domain.users.Employee;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFactoryTest {

    @Test
    public void successTest() {
        Employee employee = EmployeeFactory
                .newEmployee("217046207", "217046207@mycput.ac.za", new Name());// TODO: 2022/06/13 Implement with proper Name instance.
        System.out.println(employee);
        assertNotNull(employee);
    }

    @Test
    public void failInvalidStaffIdTest(){ // Empty StaffId provided... TEST IS SUPPOSED TO FAIL
        Employee employee = EmployeeFactory
                .newEmployee("", "217046207@mycput.ac.za", new Name());// TODO: 2022/06/13 Implement with proper Name instance.
        System.out.println(employee);
        assertNotNull(employee);
    }

    @Test
    public void failInvalidEmailTest(){ // Invalid email address is provided... TEST IS SUPPOSED TO FAIL
        Employee employee = EmployeeFactory
                .newEmployee("217046207", "217046207#mycput.ac.za", new Name());// TODO: 2022/06/13 Implement with proper Name instance.
        System.out.println(employee);
        assertNotNull(employee);
    }

    @Test
    public void failInvalidNameTest(){ // Null value is provided instead of class object... TEST IS SUPPOSED TO FAIL
        Employee employee = EmployeeFactory
                .newEmployee("217046207", "217046207@mycput.ac.za", null);
        System.out.println(employee);
        assertNotNull(employee);
    }
}