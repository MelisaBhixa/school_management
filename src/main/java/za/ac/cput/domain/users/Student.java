/**
 Student.java
 Entity for the Student
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */

package za.ac.cput.domain.users;

import za.ac.cput.domain.userInfo.Name;

public class Student {

    public String studentID;
    public String email;
    public Name name;


    public Student(Student.Builder builder) {

        this.studentID = builder.studentID;
        this.email = builder.email;
        this.name = builder.name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getEmail() {
        return email;
    }

    public Name getName(){
        return name;
    }

    public static class Builder {

        private String studentID;
        private String email;
        private Name name;

        public Student.Builder setStudentID(String studentID) {
            this.studentID = studentID;
            return this;
        }

        public Student.Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student.Builder setName(Name name) {
            this.name = name;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        public Student.Builder copy(Student student) {
            this.studentID = student.studentID;
            this.email = student.email;
            this.name = student.name;
            return this;

        }

        @Override

        public String toString() {
            return "StudentAddress{" +
                    ", name ='" + name + '\'' +
                    "studentID='" + studentID + '\'' +
                    ", email ='" + email + '\'' +
                    '}';

        }
    }
}

