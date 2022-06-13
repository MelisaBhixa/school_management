/*
 * City Factory
 * CityFactory.java
 * Author: Panashe Muinzani (218186568)
 * 13 June 2022
 */

package za.ac.cput.factory.location;

import za.ac.cput.domain.location.City;
import za.ac.cput.domain.location.Country;

public class CityFactory {

    public static City createCity (String id, String name, Country country){

        return new City.CityBuilder()
                .setId(id)
                .setName(name)
                .setCountry(country)
                .build();
    }
}
