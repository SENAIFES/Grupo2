
package entity;

import java.util.Date;

public class Tarefa {

   
    
    private String descricao;
    private Date prazo;
    private Boolean feito;
    
    //  getters and setters

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
