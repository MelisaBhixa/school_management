/**
 IEmployeeAddressRepository.java
 Repository interface for the EmployeeAddress
 Author: Legiste Ndabashinze (217046207)
 Date: 16 June 2022
 */
package za.ac.cput.repository.lookup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.lookup.EmployeeAddress;

@Repository
public interface IEmployeeAddressRepository extends JpaRepository<EmployeeAddress, String> {
}
