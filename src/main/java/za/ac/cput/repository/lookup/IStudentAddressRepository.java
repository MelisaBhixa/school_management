/**
 IStudentAddressRepository.java
 Entity for IStudentAddressRepository
 Author: Zuko Fukula (217299911)
 Date: 13 June 2022
 */


package za.ac.cput.repository.lookup;

import za.ac.cput.domain.lookup.StudentAddress;
import za.ac.cput.repository.IRepository;
import java.util.List;

public interface IStudentAddressRepository extends IRepository<StudentAddress, String> {
    List<StudentAddress> getAll();
}
