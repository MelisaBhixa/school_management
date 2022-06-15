package za.ac.cput.repository.location;

import za.ac.cput.domain.location.Country;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface ICountryRepository extends IRepository <Country, String> {
    List<Country> getAll();
    List<Country> findbyId(String id);
}