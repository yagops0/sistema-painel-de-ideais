package repositories;

import model.Ideia;

import java.util.List;

public interface Repository<T> {

    void save(T dado);
    T findById(int id);
    List<T> findAll();
    void deleteById(int id);
    void deleteAll();

}
