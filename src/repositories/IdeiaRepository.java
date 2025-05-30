package repositories;

import model.Ideia;

import java.util.List;

public interface IdeiaRepository extends Repository<Ideia>{

    void save(Ideia ideia);
    Ideia findById(int id);
    List<Ideia> findAll();
    void deleteById(int id);
    void deleteAll();
    List<Ideia> findByStatus(String status);
    List<Ideia> findByTipoIdeia(String tipoIdeia);
}
