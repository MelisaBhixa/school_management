/**
 IEmployeeAddressRepository.java
 Repository interface for the EmployeeAddress
 Author: Legiste Ndabashinze (217046207)
 Date: 14 June 2022
 */
package za.ac.cput.repository.lookup;

import za.ac.cput.domain.lookup.EmployeeAddress;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface IEmployeeAddressRepository extends IRepository<EmployeeAddress, String> {
    List<EmployeeAddress> getAll();
}
