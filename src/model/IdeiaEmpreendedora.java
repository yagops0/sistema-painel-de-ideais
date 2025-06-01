package model;

import java.util.List;

public class IdeiaEmpreendedora extends Ideia{

    private String areaEmpreendimento;
    private double valorAproximado;

    public IdeiaEmpreendedora() {
        this.setTipoIdeia(TipoIdeia.EMPREENDEDORA);
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

    public String getAreaEmpreendimento() {
        return areaEmpreendimento;
    }

    public void setAreaEmpreendimento(String areaEmpreendimento) {
        this.areaEmpreendimento = areaEmpreendimento;
    }

    public double getValorAproximado() {
        return valorAproximado;
    }

    public void setValorAproximado(double valorAproximado) {
        this.valorAproximado = valorAproximado;
    }
}
