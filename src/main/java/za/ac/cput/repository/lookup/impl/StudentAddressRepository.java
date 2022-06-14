/**
 StudentAddressRepository.java
 Entity for StudentAddressRepository
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */

package za.ac.cput.repository.lookup.impl;

import za.ac.cput.domain.lookup.StudentAddress;
import za.ac.cput.repository.lookup.IStudentAddressRepository;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StudentAddressRepository implements IStudentAddressRepository
{

    private static StudentAddressRepository StudentAddressRepository;
    private Set<StudentAddress> studentAddressDB;

    public StudentAddressRepository(){
        this.studentAddressDB= new HashSet<>();
    }

    public static StudentAddressRepository getRepository(){
        if (StudentAddressRepository == null)
        {
            StudentAddressRepository = new StudentAddressRepository();
        }
        return StudentAddressRepository;
    }

    @Override
    public StudentAddress save(StudentAddress studentAddress) {
        Optional <StudentAddress> read = read(studentAddress.getStudentID());
        if (read.isPresent()){
            delete(read.get());
        }
        this.studentAddressDB.add(studentAddress);
        return studentAddress;
    }

    @Override
    public Optional<StudentAddress> read(String studentID){
        return this.studentAddressDB.stream()
                .filter(studentAddress -> studentAddress.getStudentID()
                        .equalsIgnoreCase(studentID)).findFirst();
    }

    @Override
    public StudentAddress update(StudentAddress studentAddress) {
        Optional<StudentAddress> read = read(studentAddress.getStudentID());

        if (read != null) {
            studentAddressDB.remove(read);
            studentAddressDB.add(studentAddress);
            return studentAddress;
        }
        return studentAddress;
    }

    @Override
    public void delete(StudentAddress studentAddress) {
        this.studentAddressDB.remove(studentAddress);
    }

    @Override
    public Set<StudentAddress> getAll() {
        return studentAddressDB;
    }
}

