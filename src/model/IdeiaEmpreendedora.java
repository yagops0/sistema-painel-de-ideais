package model;

import java.util.List;

public class IdeiaEmpreendedora extends Ideia{

    private String areaEmpreendimento;
    private double valorAproximado;

    public IdeiaEmpreendedora() {
    }

    public IdeiaEmpreendedora(String titulo, String descricao, String areaEmpreendimento, double valorAproximado) {
        super(titulo, descricao);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(String titulo, String descricao, List<String> anotacoes, String areaEmpreendimento, double valorAproximado) {
        super(titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(String titulo, String descricao, Status status, String areaEmpreendimento, double valorAproximado) {
        super(titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    public IdeiaEmpreendedora(String titulo, String descricao, Status status, List<String> anotacoes, String areaEmpreendimento, double valorAproximado) {
        super(titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
        this.areaEmpreendimento = areaEmpreendimento;
        this.valorAproximado = valorAproximado;
    }

    
}
