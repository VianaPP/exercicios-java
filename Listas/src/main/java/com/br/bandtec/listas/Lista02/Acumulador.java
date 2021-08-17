/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.listas.Lista02;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Acumulador {

    public static void main(String[] args) {

        Integer somaNums = 0;

        for (Integer numAle = ThreadLocalRandom.current().nextInt(0, 10); 
             numAle != 0; 
             numAle = ThreadLocalRandom.current().nextInt(0, 10)) {
                System.out.println("Numes sorteados: " + numAle);
                somaNums += numAle;
        }
        System.out.println(String.format("A soma dos Numeros é: %d", somaNums));
        

//        Integer numAle;
//        
//        do {
//            numAle = ThreadLocalRandom.current().nextInt(0, 10);
//            
//            System.out.println(numAle);
//            
//            somaNums += numAle;
//
//        } while (numAle != 0);
//
//        System.out.println(String.format("A soma dos Numeros é: %d", somaNums));
    }
}
