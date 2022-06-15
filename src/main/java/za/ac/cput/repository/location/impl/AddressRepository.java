/*
AddressRepository.java
Repository for Address
Author: Melisa Bhixa
Date: 15 June 2022
 */

package za.ac.cput.repository.location.impl;

import za.ac.cput.domain.location.Address;
import za.ac.cput.repository.location.IAddressRepository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AddressRepository implements IAddressRepository {

     private List<Address> AddressList;
     private static AddressRepository ADDRESS_REPOSITORY;

    public static AddressRepository getRepository() {
         if (ADDRESS_REPOSITORY == null)
             ADDRESS_REPOSITORY = new AddressRepository();
         return ADDRESS_REPOSITORY;
     }

     private AddressRepository() {
         this.AddressList = new ArrayList<>();
     }

     @Override
     public Address save(Address address) {
         Optional<Address> read = read(address.getUnitNumber());
            if (read.isPresent()) {
                delete(read.get());
            }
         this.AddressList.add(address);
            return address;
     }

    @Override
    public Optional<Address> read(String unitNumber) {
        return this.AddressList.stream()
                .filter(address -> address.getUnitNumber()
                .equalsIgnoreCase(unitNumber)).findFirst();
    }

    @Override
    public Address update(Address address) {
        Optional<Address> read = read(address.getUnitNumber());
        if (read.isPresent()) {
            Address updated = new Address.AddressBuilder()
                    .copy(address)
                    .setUnitNumber(address.getUnitNumber())
                    .setComplexName(address.getComplexName())
                    .setStreetNumber(address.getStreetNumber())
                    .setStreetName(address.getStreetName())
                    .setPostalCode(address.getPostalCode())
                    .setCity(address.getCity())
                    .build();

            delete(address);
            this.AddressList.add(updated);
        }
        return read.get();
    }

    @Override
    public void delete(Address address) {
           this.AddressList.remove(address);
    }

    @Override
    public List<Address> getAll() {
        return AddressList;
    }
}