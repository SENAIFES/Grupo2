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
    

    @Override
    public String toString() {
        return nome;
    }

    public Lista() {
        
    }

    public Lista(int id) {
        this.id = id;
    }

    public Lista(String nome) {
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

    
}
