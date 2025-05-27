package model;

import java.util.List;

public class IdeiaCriativa extends Ideia{

    private String materiais;

    public IdeiaCriativa() {
    }

    public IdeiaCriativa(int id, String titulo, String descricao, String materiais) {
        super(id, titulo, descricao);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    public IdeiaCriativa(int id, String titulo, String descricao, List<String> anotacoes, String materiais) {
        super(id, titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    public IdeiaCriativa(int id, String titulo, String descricao, Status status, String materiais) {
        super(id, titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    public IdeiaCriativa(int id, String titulo, String descricao, Status status, List<String> anotacoes, String materiais) {
        super(id, titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    
}
