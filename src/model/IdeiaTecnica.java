package model;

import java.util.List;

public class IdeiaTecnica extends Ideia{

    private String especialidade;
    private String detalhamentoTecnico;
    private String ferramenta;

    public IdeiaTecnica() {
        this.setTipoIdeia(TipoIdeia.TECNICA);
    }

    public IdeiaTecnica(int id, String titulo, String descricao, String especialidade, String detalhamentoTecnico, String ferramenta) {
        super(id, titulo, descricao);
        this.setTipoIdeia(TipoIdeia.TECNICA);
        this.especialidade = especialidade;
        this.detalhamentoTecnico = detalhamentoTecnico;
        this.ferramenta = ferramenta;
    }

    public IdeiaTecnica(int id, String titulo, String descricao, List<String> anotacoes, String especialidade, String detalhamentoTecnico, String ferramenta) {
        super(id, titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.TECNICA);
        this.especialidade = especialidade;
        this.detalhamentoTecnico = detalhamentoTecnico;
        this.ferramenta = ferramenta;
    }

    public IdeiaTecnica(int id, String titulo, String descricao, Status status, String especialidade, String detalhamentoTecnico, String ferramenta) {
        super(id, titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.TECNICA);
        this.especialidade = especialidade;
        this.detalhamentoTecnico = detalhamentoTecnico;
        this.ferramenta = ferramenta;
    }

    public IdeiaTecnica(int id, String titulo, String descricao, Status status, List<String> anotacoes, String especialidade, String detalhamentoTecnico, String ferramenta) {
        super(id, titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.TECNICA);
        this.especialidade = especialidade;
        this.detalhamentoTecnico = detalhamentoTecnico;
        this.ferramenta = ferramenta;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getDetalhamentoTecnico() {
        return detalhamentoTecnico;
    }

    public void setDetalhamentoTecnico(String detalhamentoTecnico) {
        this.detalhamentoTecnico = detalhamentoTecnico;
    }

    public String getFerramenta() {
        return ferramenta;
    }

    public void setFerramenta(String ferramenta) {
        this.ferramenta = ferramenta;
    }
}
