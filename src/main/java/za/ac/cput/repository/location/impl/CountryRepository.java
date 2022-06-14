package za.ac.cput.repository.location.impl;

import za.ac.cput.domain.location.Country;
import za.ac.cput.repository.location.ICountryRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountryRepository implements ICountryRepository {

    private final List<Country> countryList;
    private static CountryRepository COUNTRY_REPOSITORY;

    public static CountryRepository getRepository(){
        if (COUNTRY_REPOSITORY == null)
            COUNTRY_REPOSITORY = new CountryRepository();
        return COUNTRY_REPOSITORY;
    }

    private CountryRepository(){
        this.countryList = new ArrayList<>();
    }

    @Override
    public Country save(Country country) {
        Optional<Country> read = read(country.getId());
        if (read.isPresent()){
            delete(read.get());
        }
        this.countryList.add(country);
        return country;
    }

    @Override
    public Optional<Country> read(String id) {
        return this.countryList.stream()
                .filter(city -> city.getId()
                        .equalsIgnoreCase(id)).findFirst();
    }

    @Override
    public Country update(Country country) {
        Optional<Country> read = read(country.getId());

        if (read.isPresent()){
            Country updated = new Country.CountryBuilder()
                    .copy(country)
                    .setId(country.getId())
                    .setName(country.getName())
                    .build();

            delete(country);
            this.countryList.add(updated);
        }
        return country;
    }

    @Override
    public void delete(Country country) {
        this.countryList.remove(country);
    }

    @Override
    public List<Country> getAll() {
        return countryList;
    }

    @Override
    public List<Country> findbyId(String id) {
        return this.countryList.stream()
                .filter(country -> country.getId()
                        .equalsIgnoreCase(id))
                .collect(Collectors.toList());
    }
}