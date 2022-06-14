/**
 StudentFactory.java
 Entity for StudentFactory
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */

package za.ac.cput.factory.users;

import za.ac.cput.domain.userInfo.Name;
import za.ac.cput.domain.users.Student;
import za.ac.cput.util.Helper;

public class StudentFactory {

    public static Student newStudent(String studentID, String email, Name name) {
        Helper.checkStringParam("studentID", studentID);
        Helper.checkStringParam("email", email);

        return new Student.Builder().setStudentID(studentID).setEmail(email).setName(name).build();
    }
}
