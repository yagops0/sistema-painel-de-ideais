package repositories;

import model.Ideia;

import java.util.ArrayList;
import java.util.List;

public class IdeiaRepositoryEmMemoria implements IdeiaRepository{

    private List<Ideia> bdIdeias = new ArrayList<>();

    private int getIndex(int id){

        for (Ideia i : bdIdeias){
            if (i.getId() == id){
                return bdIdeias.indexOf(i);
            }
        }
        return -1;
    }

    private boolean existsById(int id) {

        for (Ideia i : this.bdIdeias){
            if (i.getId() == id){
                return true;
            }
        }
        return false;
    }

    @Override
    public void save(Ideia ideia) {

        if (existsById(ideia.getId())){
            bdIdeias.set(getIndex(ideia.getId()), ideia);
        }else {
            bdIdeias.add(ideia);
        }
    }

    @Override
    public Ideia findById(int id) {

        for (Ideia i : bdIdeias){
            if (i.getId() == id){
                return i;
            }
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        if (existsById(id)){
            bdIdeias.remove(getIndex(id));
        }
    }

    @Override
    public void deleteAll() {
        bdIdeias.clear();
    }

    @Override
    public List<Ideia> findAll() {
        return bdIdeias;
    }


    @Override
    public List<Ideia> findByStatus(String status) {
        List<Ideia> ideiasStatus = new ArrayList<>();

        for (Ideia i : bdIdeias){
            if (status.equalsIgnoreCase(i.getStatus().toString())){
                ideiasStatus.add(i);
            }
        }

        return ideiasStatus;
    }


    @Override
    public List<Ideia> findByTipoIdeia(String tipoIdeia) {
        List<Ideia> ideiasTipoIdeia = new ArrayList<>();

        for (Ideia i : bdIdeias){
            if (tipoIdeia.equalsIgnoreCase(i.getTipoIdeia().toString())){
                ideiasTipoIdeia.add(i);
            }
        }

        return ideiasTipoIdeia;
    }
}
