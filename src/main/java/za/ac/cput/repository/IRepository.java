package za.ac.cput.repository;

public interface IRepository<T ,Id> {
    T save(T t);
    T read(Id id);
    T update(T t);
    void delete(Id id);
}