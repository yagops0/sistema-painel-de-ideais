package model;

import java.util.List;

public class IdeiaCriativa extends Ideia{

    private String materiais;

    public IdeiaCriativa() {
    }

    public IdeiaCriativa(String titulo, String descricao, String materiais) {
        super(titulo, descricao);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    public IdeiaCriativa(String titulo, String descricao, List<String> anotacoes, String materiais) {
        super(titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    public IdeiaCriativa(String titulo, String descricao, Status status, String materiais) {
        super(titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    public IdeiaCriativa(String titulo, String descricao, Status status, List<String> anotacoes, String materiais) {
        super(titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.CRIATIVA);
        this.materiais = materiais;
    }

    
}
