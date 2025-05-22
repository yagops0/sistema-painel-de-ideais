package repositories;

import model.Ideia;
import model.Prioridade;
import model.Status;
import model.TipoIdeia;

import java.util.List;

public interface IdeiaRepository {

    void save(Ideia ideia);
    Ideia findById(int id);
    List<Ideia> findAll();
    void deleteById(int i);
    void deleteAll();
    boolean existsById(int id);
    List<Ideia> findByStatus(Status status);
    List<Ideia> findByPrioridade(Prioridade prioridade);
    List<Ideia> findByTipoIdeia(TipoIdeia tipoIdeia);
}
