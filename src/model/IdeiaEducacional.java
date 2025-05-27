package model;

import java.util.List;

public class IdeiaEducacional extends Ideia{

    private String materiaisDeEstudo;
    private String plataforma;

    public IdeiaEducacional() {
    }

    public IdeiaEducacional(String titulo, String descricao, String materiaisDeEstudo, String plataforma) {
        super(titulo, descricao);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public IdeiaEducacional(String titulo, String descricao, List<String> anotacoes, String materiaisDeEstudo, String plataforma) {
        super(titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public IdeiaEducacional(String titulo, String descricao, Status status, String materiaisDeEstudo, String plataforma) {
        super(titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public IdeiaEducacional(String titulo, String descricao, Status status, List<String> anotacoes, String materiaisDeEstudo, String plataforma) {
        super(titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    
}
