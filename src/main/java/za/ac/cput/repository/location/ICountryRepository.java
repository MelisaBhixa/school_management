package za.ac.cput.repository.location;

<<<<<<< 217217095
import za.ac.cput.domain.location.Country;
import za.ac.cput.repository.IRepository;

import java.util.List;

public interface ICountryRepository extends IRepository <Country, String> {
    List<Country> getAll();
    List<Country> findbyId(String id);
=======
public interface ICountryRepository {
>>>>>>> master
}
