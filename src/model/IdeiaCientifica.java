package model;

import java.util.List;

public class IdeiaCientifica extends Ideia{

    private String campoDeEstudo;
    private boolean seraPublicado;

    public IdeiaCientifica() {
    }

    public IdeiaCientifica(int id, String titulo, String descricao, String campoDeEstudo, boolean seraPublicado) {
        super(id, titulo, descricao);
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
        this.campoDeEstudo = campoDeEstudo;
        this.seraPublicado = seraPublicado;
    }

    public IdeiaCientifica(int id, String titulo, String descricao, List<String> anotacoes, String campoDeEstudo, boolean seraPublicado) {
        super(id, titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
        this.campoDeEstudo = campoDeEstudo;
        this.seraPublicado = seraPublicado;
    }

    public IdeiaCientifica(int id, String titulo, String descricao, Status status, String campoDeEstudo, boolean seraPublicado) {
        super(id, titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
        this.campoDeEstudo = campoDeEstudo;
        this.seraPublicado = seraPublicado;
    }

    public IdeiaCientifica(int id, String titulo, String descricao, Status status, List<String> anotacoes, String campoDeEstudo, boolean seraPublicado) {
        super(id, titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
        this.campoDeEstudo = campoDeEstudo;
        this.seraPublicado = seraPublicado;
    }

    public IdeiaCientifica(int id, String titulo, String descricao, Status status, Prioridade prioridade, String campoDeEstudo, boolean seraPublicado) {
        super(id, titulo, descricao, status, prioridade);
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
        this.campoDeEstudo = campoDeEstudo;
        this.seraPublicado = seraPublicado;
    }

    public IdeiaCientifica(int id, String titulo, String descricao, Status status, Prioridade prioridade, List<String> anotacoes, String campoDeEstudo, boolean seraPublicado) {
        super(id, titulo, descricao, status, prioridade, anotacoes);
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
        this.campoDeEstudo = campoDeEstudo;
        this.seraPublicado = seraPublicado;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + " Title: " + this.getTitulo() + " Desc: " + this.getDescricao() + " Tipo: " + this.getTipoIdeia().toString();
    }
}
