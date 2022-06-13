package za.ac.cput.repository;

import java.util.Optional;

public interface IRepository<T ,Id> {
    T save(T t);
    Optional <T> read(Id id);
    T update(T t);
    void delete(T t);
}
