package model;

import java.util.List;



public abstract class Ideia {

    
    private static int somarId = 1;// VARIAVEIS ESTÁTICAS PERTENCEM A CLASSE NÃO A CADA INSTÂNCIA, OU SEJA, TODAS AS INSTÂNCIAS COMPARTILHAM A MESMA VARIAVEL
    private int id;
    private String titulo;
    private String descricao;
    private TipoIdeia tipoIdeia;
    private Status status;
    private List<String> anotacoes;

    public Ideia() {
        this.id = somarId++;
    }

    // Ideia sem status e anotacoes
    public Ideia(String titulo, String descricao) {
        this.id = somarId++;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    // Ideia sem status mas com anotacoes
    public Ideia(String titulo, String descricao, List<String> anotacoes) {
        this(titulo, descricao);
        this.id = somarId++;
        this.anotacoes = anotacoes;
    }

    // Ideia com status sem anotacoes
    public Ideia(String titulo, String descricao, Status status) {
        this(titulo, descricao);
        this.id = somarId++;
        this.status = status;
    }

    // Ideia com status e anotacoes
    public Ideia(String titulo, String descricao, Status status, List<String> anotacoes) {
        this(titulo, descricao, status);
        this.id = somarId++;
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

    public List<String> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(List<String> anotacoes) {
        this.anotacoes = anotacoes;
    }

    


    

    
 
}
