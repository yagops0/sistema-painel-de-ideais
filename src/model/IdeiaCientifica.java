package model;

import java.util.List;

public class IdeiaCientifica extends Ideia{

    private String campoDeEstudo;
    private boolean seraPublicado;

    public IdeiaCientifica() {
        this.setTipoIdeia(TipoIdeia.CIENTIFICA);
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

    public String getCampoDeEstudo() {
        return campoDeEstudo;
    }

    public void setCampoDeEstudo(String campoDeEstudo) {
        this.campoDeEstudo = campoDeEstudo;
    }

    public boolean isSeraPublicado() {
        return seraPublicado;
    }

    public void setSeraPublicado(boolean seraPublicado) {
        this.seraPublicado = seraPublicado;
    }

    @Override
    public String toString() {
        return "ID: " + this.getId() + " Title: " + this.getTitulo() + " Desc: " + this.getDescricao() + " Tipo: " + this.getTipoIdeia().toString();
    }
}
