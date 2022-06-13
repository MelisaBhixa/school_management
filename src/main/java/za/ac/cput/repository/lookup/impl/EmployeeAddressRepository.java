/**
 EmployeeAddressRepository.java
 Repository class for the EmployeeAddress
 Author: Legiste Ndabashinze (217046207)
 Date: 14 June 2022
 */
package za.ac.cput.repository.lookup.impl;

import za.ac.cput.domain.lookup.EmployeeAddress;
import za.ac.cput.repository.lookup.IEmployeeAddressRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeAddressRepository implements IEmployeeAddressRepository {
    private final List <EmployeeAddress> employeeAddressList;
    private static EmployeeAddressRepository EMPLOYEE_ADDRESS_REPOSITORY;

    public static EmployeeAddressRepository employeeAddress(){
        if (EMPLOYEE_ADDRESS_REPOSITORY == null)
            EMPLOYEE_ADDRESS_REPOSITORY = new EmployeeAddressRepository();
        return EMPLOYEE_ADDRESS_REPOSITORY;
    }

    private EmployeeAddressRepository(){
        this.employeeAddressList = new ArrayList<>();
    }
    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) {
        Optional <EmployeeAddress> read = read(employeeAddress.getStaffId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.employeeAddressList.add(employeeAddress);
        return employeeAddress;
    }

    @Override
    public Optional <EmployeeAddress> read(String employeeId) {
        return this.employeeAddressList.stream()
                .filter(employeeAddress -> employeeAddress.getStaffId()
                        .equalsIgnoreCase(employeeId)).findFirst();
    }

    @Override
    public EmployeeAddress update(EmployeeAddress employeeAddress) {
        Optional<EmployeeAddress> read = read(employeeAddress.getStaffId());

        if (read.isPresent()){
            EmployeeAddress updated = new EmployeeAddress.EmployeeAddressBuilder()
                    .copy(employeeAddress)
                    .setAddress(employeeAddress.getAddress())
                    .build();

            delete(employeeAddress);
            this.employeeAddressList.add(updated);
        }
        return employeeAddress;
    }

    @Override
    public void delete(EmployeeAddress employeeAddress) {
        this.employeeAddressList.remove(employeeAddress);
    }

    @Override
    public List<EmployeeAddress> getAll() {
        return employeeAddressList;
    }
}
