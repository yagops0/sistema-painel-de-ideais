package model;

import java.util.List;

public class IdeiaEducacional extends Ideia{

    private String materiaisDeEstudo;
    private String plataforma;

    public IdeiaEducacional() {
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
    }

    public IdeiaEducacional(int id, String titulo, String descricao, String materiaisDeEstudo, String plataforma) {
        super(id, titulo, descricao);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public IdeiaEducacional(int id, String titulo, String descricao, List<String> anotacoes, String materiaisDeEstudo, String plataforma) {
        super(id, titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public IdeiaEducacional(int id, String titulo, String descricao, Status status, String materiaisDeEstudo, String plataforma) {
        super(id, titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public IdeiaEducacional(int id, String titulo, String descricao, Status status, List<String> anotacoes, String materiaisDeEstudo, String plataforma) {
        super(id, titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.EDUCACIONAL);
        this.materiaisDeEstudo = materiaisDeEstudo;
        this.plataforma = plataforma;
    }

    public String getMateriaisDeEstudo() {
        return materiaisDeEstudo;
    }

    public void setMateriaisDeEstudo(String materiaisDeEstudo) {
        this.materiaisDeEstudo = materiaisDeEstudo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
