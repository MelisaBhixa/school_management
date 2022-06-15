/*
AddressIRepository.java
IRepository for Address
Author: Melisa Bhixa
Date: 15 June 2022
 */

package za.ac.cput.repository.location;

import za.ac.cput.domain.location.Address;
import za.ac.cput.repository.IRepository;
import java.util.List;


public interface IAddressRepository extends IRepository<Address, String> {
    List<Address> getAll();
}
