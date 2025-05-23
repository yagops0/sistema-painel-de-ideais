package model;

import java.util.List;

public class IdeiaTecnica extends Ideia{

    private String especialidade;
    private String detalhamentoTecnico;
    private String ferramenta;

    public IdeiaTecnica() {
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

    public IdeiaTecnica(int id, String titulo, String descricao, Status status, Prioridade prioridade, String especialidade, String detalhamentoTecnico, String ferramenta) {
        super(id, titulo, descricao, status, prioridade);
        this.setTipoIdeia(TipoIdeia.TECNICA);
        this.especialidade = especialidade;
        this.detalhamentoTecnico = detalhamentoTecnico;
        this.ferramenta = ferramenta;
    }

    public IdeiaTecnica(int id, String titulo, String descricao, Status status, Prioridade prioridade, List<String> anotacoes, String especialidade, String detalhamentoTecnico, String ferramenta) {
        super(id, titulo, descricao, status, prioridade, anotacoes);
        this.setTipoIdeia(TipoIdeia.TECNICA);
        this.especialidade = especialidade;
        this.detalhamentoTecnico = detalhamentoTecnico;
        this.ferramenta = ferramenta;
    }
}
