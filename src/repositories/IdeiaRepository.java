package repositories;

import model.Ideia;

import java.util.List;

public interface IdeiaRepository extends Repository<Ideia>{

    List<Ideia> findByStatus(String status);
    List<Ideia> findByTipoIdeia(String tipoIdeia);
}
