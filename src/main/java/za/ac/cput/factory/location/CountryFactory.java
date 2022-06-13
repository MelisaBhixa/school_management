/*
 * Country Factory
 * CountryFactory.java
 * Thina Mbiza 217217095
 * 12 June 2022
 */

package za.ac.cput.factory.location;

import za.ac.cput.domain.location.Country;

public class CountryFactory {

    public static Country createCountry (String id, String name){

        return new Country.Builder()
                .setId(id)
                .setName(name)
                .build();
    }
}


