/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jogodobicho;

import java.util.Random;

/**
 *
 * @author Jackson Nascimento
 */
public class NumeroAlea {
    public int alea(){
            Random gerador = new Random();
            
          int numero = gerador.nextInt(100);
            
            return numero;
    }
}
