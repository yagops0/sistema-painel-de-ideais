package service;

import model.Ideia;
import repositories.IdeiaRepository;
import repositories.IdeiaRepositoryEmMemoria;

import java.util.List;

public class IdeiaService {

    private IdeiaRepository ideiaRepository;

    public IdeiaService(IdeiaRepository ideiaRepository){
            this.ideiaRepository = ideiaRepository;
    }

    public boolean criarIdeia(Ideia ideia){
        if (ideia.getTitulo() == null || ideia.getTitulo().isBlank()){
            System.out.println("A ideia precisa de um título!");
            return false;
        }
        if (ideia.getDescricao() == null || ideia.getDescricao().isBlank()){
            System.out.println("A ideia precisa de uma descrição!");
            return false;
        }
        for (Ideia i : ideiaRepository.findAll()){
            if (i.getTitulo().equalsIgnoreCase(ideia.getTitulo())){
                System.out.println("Ideias com o mesmo titulo não podem ser criadas!");
                return false;
            }
        }

        ideiaRepository.save(ideia);
        return true;
    }

    public List<Ideia> retornarIdeias(){
        return ideiaRepository.findAll();
    }

    public IdeiaRepository getIdeiaRepository() {
        return ideiaRepository;
    }

    public void setIdeiaRepository(IdeiaRepository ideiaRepository) {
        this.ideiaRepository = ideiaRepository;
    }
}
