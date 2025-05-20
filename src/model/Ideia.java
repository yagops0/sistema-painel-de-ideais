package model;

import java.util.List;

public abstract class Ideia {

    private int id;
    private String titulo;
    private String descricao;
    private TipoIdeia tipoIdeia;
    private Status status;
    private Prioridade prioridade;
    private List<String> anotacoes;

    public Ideia() {
    }

    // Ideia sem status/prioridade e anotacoes
    public Ideia(int id, String titulo, String descricao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Ideia sem status/prioridade mas com anotacoes
    public Ideia(int id, String titulo, String descricao, List<String> anotacoes) {
        this(id, titulo, descricao);
        this.anotacoes = anotacoes;
    }

    // Ideia com status sem prioridade e sem anotacoes
    public Ideia(int id, String titulo, String descricao, Status status) {
        this(id, titulo, descricao);
        this.status = status;
    }

    // Ideia com status sem prioridade mas com anotacoes
    public Ideia(int id, String titulo, String descricao, Status status, List<String> anotacoes) {
        this(id, titulo, descricao, status);
        this.anotacoes = anotacoes;
    }

    // Ideia com status/prioridade sem anotacoes
    public Ideia(int id, String titulo, String descricao, Status status, Prioridade prioridade) {
        this(id, titulo, descricao, status);
        this.prioridade = prioridade;
    }

    // Ideia com status/prioridade com anotacoes
    public Ideia(int id, String titulo, String descricao, Status status, Prioridade prioridade, List<String> anotacoes) {
        this(id, titulo, descricao, status, prioridade);
        this.anotacoes = anotacoes;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoIdeia getTipoIdeia() {
        return tipoIdeia;
    }

    public void setTipoIdeia(TipoIdeia tipoIdeia) {
        this.tipoIdeia = tipoIdeia;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public List<String> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(List<String> anotacoes) {
        this.anotacoes = anotacoes;
    }
}
