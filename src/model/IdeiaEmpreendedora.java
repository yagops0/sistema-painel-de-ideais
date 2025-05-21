package model;

import java.util.List;

public class IdeiaEmpreendedora extends Ideia{

    private String areaEmpreendimento;
    private double valorAproximado;

    public IdeiaEmpreendedora() {
    }

    public IdeiaEmpreendedora(int id, String titulo, String descricao, String areaEmpreendimento, double valorAproximado) {
        super(id, titulo, descricao);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(int id, String titulo, String descricao, List<String> anotacoes, String areaEmpreendimento, double valorAproximado) {
        super(id, titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(int id, String titulo, String descricao, Status status, String areaEmpreendimento, double valorAproximado) {
        super(id, titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(int id, String titulo, String descricao, Status status, List<String> anotacoes, String areaEmpreendimento, double valorAproximado) {
        super(id, titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(int id, String titulo, String descricao, Status status, Prioridade prioridade, String areaEmpreendimento, double valorAproximado) {
        super(id, titulo, descricao, status, prioridade);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(int id, String titulo, String descricao, Status status, Prioridade prioridade, List<String> anotacoes, String areaEmpreendimento, double valorAproximado) {
        super(id, titulo, descricao, status, prioridade, anotacoes);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }
}
