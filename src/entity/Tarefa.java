package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tarefa {

    public Tarefa(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return descricao;
    }

    public Tarefa(String descricao, Date prazo, Boolean feito) {
        this.descricao = descricao;
        this.prazo = prazo;
        this.feito = feito;
    }
    private int id;
    private String descricao;
    private Date prazo;
    private Boolean feito;
    

   
    public Tarefa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
