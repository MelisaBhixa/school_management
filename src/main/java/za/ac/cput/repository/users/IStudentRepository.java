/**
 IStudentRepository.java
 Entity for IStudentRepository
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */


package za.ac.cput.repository.users;

import za.ac.cput.domain.users.Student;
import za.ac.cput.repository.IRepository;
import java.util.List;

public interface IStudentRepository extends IRepository<Student, String> {
    List<Student> getAll();
}
