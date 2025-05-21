package model;

import java.util.List;

public class IdeiaGenerica extends Ideia{

    private String especificidade;

    public IdeiaGenerica() {
    }

    public IdeiaGenerica(int id, String titulo, String descricao, String especificidade) {
        super(id, titulo, descricao);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaGenerica(int id, String titulo, String descricao, List<String> anotacoes, String especificidade) {
        super(id, titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaGenerica(int id, String titulo, String descricao, Status status, String especificidade) {
        super(id, titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaGenerica(int id, String titulo, String descricao, Status status, List<String> anotacoes, String especificidade) {
        super(id, titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaGenerica(int id, String titulo, String descricao, Status status, Prioridade prioridade, String especificidade) {
        super(id, titulo, descricao, status, prioridade);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaGenerica(int id, String titulo, String descricao, Status status, Prioridade prioridade, List<String> anotacoes, String especificidade) {
        super(id, titulo, descricao, status, prioridade, anotacoes);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }
}
