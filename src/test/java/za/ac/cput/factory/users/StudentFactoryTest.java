/**
 StudentFactoryTest.java
 Factory test for the StudentFactory
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */

package za.ac.cput.factory.users;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.userInfo.Name;
import za.ac.cput.domain.users.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    public void invalidTest(){
        Student student = StudentFactory.newStudent("217299911", "217299911@mycput.ac.za", new Name());
        assertNull(student.getStudentID());
        System.out.println(student);
    }

    @Test

    public void equalityValidTest(){
        Student student = StudentFactory.newStudent("217299911", "217299911@mycput.ac.za", new Name());
        System.out.println("Email: "+ student.getEmail());
        assertEquals("217299911@mycput.ac.za", student.getEmail());
    }

    @Test
    public void validTest(){
        Student student = StudentFactory.newStudent("", "217299911@mycput.ac.za", new Name());
        assertNull(student.getStudentID());
        System.out.println(student);
    }

    @Disabled("Test Disabled")
    @Test

    public void disableTest(){
        Student student = StudentFactory.newStudent("217299911", "217299911@mycput.ac.za", new Name());
        assertSame("217299911", student.getStudentID());
    }
}
