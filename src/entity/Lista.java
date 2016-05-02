/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renann_schutz
 */
public class Lista {
    
    private int id;
    private String nome;
    private List<Tarefa> listatarefa;
    
    public Lista(){
        listatarefa = new ArrayList();
    }

    
    public Lista(int id){
        this.id = id;
            }
    public Lista (String nome){
        this.nome = nome;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Tarefa> getListatarefa() {
        return listatarefa;
    }

    public void setListatarefa(List<Tarefa> listatarefa) {
        this.listatarefa = listatarefa;
    }

    
    
    
}
