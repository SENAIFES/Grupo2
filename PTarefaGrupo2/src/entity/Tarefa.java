
package entity;

import java.util.Date;

public class Tarefa {

    public Tarefa(String descricao, Date prazo, Boolean feito) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.feito = feito;
    }
    
    private String descricao;
    private Date prazo;
    private Boolean feito;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getPrazo() {
        return prazo;
    }

    public void setPrazo(Date prazo) {
        this.prazo = prazo;
    }

    public Boolean getFeito() {
        return feito;
    }

    public void setFeito(Boolean feito) {
        this.feito = feito;
    }
    
    
}
