/**
 EmployeeAddress.java
 Entity for the EmployeeAddress
 Author: Legiste Ndabashinze (217046207)
 Date: 12 June 2022
 */
package za.ac.cput.domain.lookup;

import za.ac.cput.domain.location.Address;

public class EmployeeAddress {
    private final String staffId;
    private final Address address;

    private EmployeeAddress(EmployeeAddressBuilder employeeAddressBuilder) {
        this.staffId = employeeAddressBuilder.staffId;
        this.address = employeeAddressBuilder.address;
    }

    public String getStaffId() {
        return staffId;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "staffId='" + staffId + '\'' +
                ", address=" + address +
                '}';
    }

    public static class EmployeeAddressBuilder{
        private String staffId;
        private Address address;

        public EmployeeAddressBuilder setStaffId(String staffId) {
            this.staffId = staffId;
            return this;
        }

        public EmployeeAddressBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public EmployeeAddressBuilder copy(EmployeeAddress employeeAddress){
            this.staffId = employeeAddress.staffId;
            this.address = employeeAddress.address;
            return this;
        }

        public EmployeeAddress build(){
            return new EmployeeAddress(this);
        }
    }
}
