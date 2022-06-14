/**
 StudentRepository.java
 Entity for StudentRepository
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */

package za.ac.cput.repository.users.impl;

import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.users.IStudentRepository;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentRepository implements IStudentRepository
{

    private static StudentRepository StudentRepository;
    private Set<Student> studentDB;

    public StudentRepository(){
        this.studentDB= new HashSet<>();
    }

    public static StudentRepository getRepository(){
        if (StudentRepository == null)
        {
            StudentRepository = new StudentRepository();
        }
        return StudentRepository;
    }

    @Override
    public Student save(Student student) {
        Optional <Student> read = read(student.getStudentID());
        if (read.isPresent()){
            delete(read.get());
        }
        this.studentDB.add(student);
        return student;
    }

    @Override
    public Optional<Student> read(String studentID){
        return this.studentDB.stream()
                .filter(student -> student.getStudentID()
                        .equalsIgnoreCase(studentID)).findFirst();
    }

    @Override
    public Student update(Student student) {
        Optional<Student> read = read(student.getStudentID());

        if (read != null) {
            studentDB.remove(read);
            studentDB.add(student);
            return student;
        }
        return student;
    }

    @Override
    public void delete(Student student) {
        this.studentDB.remove(student);
    }

    @Override
    public Set<Student> getAll() {
        return studentDB;
    }
}
