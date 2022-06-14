/*
 * Country Factory
 * CountryFactory.java
 * Thina Mbiza 217217095
 * 12 June 2022
 */

package za.ac.cput.factory.location;

import za.ac.cput.domain.location.Country;
import za.ac.cput.util.Helper;

public class CountryFactory {

    public static Country createCountry(String name,String id){
        Helper.checkStringParam("Id", id);
        Helper.checkStringParam("name", name);
        Helper.isObjectNull(name);
        Helper.isValidId(id);


        return new Country.CountryBuilder()
                .setId(id)
                .setName(name)
                .build();
    }
}


