package model;

import java.util.List;

public class IdeiaOutro extends Ideia{

    private String especificidade;

    public IdeiaOutro() {
    }

    public IdeiaOutro(String titulo, String descricao, String especificidade) {
        super(titulo, descricao);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaOutro(String titulo, String descricao, List<String> anotacoes, String especificidade) {
        super(titulo, descricao, anotacoes);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaOutro(String titulo, String descricao, Status status, String especificidade) {
        super(titulo, descricao, status);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    public IdeiaOutro(String titulo, String descricao, Status status, List<String> anotacoes, String especificidade) {
        super(titulo, descricao, status, anotacoes);
        this.setTipoIdeia(TipoIdeia.OUTRO);
        this.especificidade = especificidade;
    }

    
}
