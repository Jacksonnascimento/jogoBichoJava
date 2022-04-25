/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogodobicho;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author jackson.nascimento
 */
public class Bicho {
    private String nome;
    private int id;
    ArrayList numero = new ArrayList<Numero>();

    public Bicho(String nome, int id, ArrayList<Numero> num) {
        numero.add(num);
        this.id = id;
        this.nome = nome;
        
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        String a = "" + getNome() + " \n"+ getNumero() + "\n";
        return a;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(ArrayList numero) {
        this.numero = numero;
    }

   
    
    
}
