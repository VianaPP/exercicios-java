/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.nivelamento2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 100: ");
        Integer num = leitor.nextInt();

        Integer posSort = 0;
        Integer pares = 0;
        Integer impares = 0;

        for (int i = 1; i < 201; i++) {

            Integer numRandom = ThreadLocalRandom.current().nextInt(1, 100);

            if (num == numRandom) {
                posSort = i;

            };

            if (numRandom % 2 == 0) {
                pares++;
            } else {
                impares++;
            };

        }
        
        Integer certo = posSort;
        
        System.out.println("O numero foi sorteado na: " + certo
                + "° vez");
        System.out.println(String.format("Foram sorteados o total de: %d"
                + " numeros pares", pares));
        System.out.println(String.format("Foram sorteados o total de: %d"
                + " numeros impares", impares));

    }
}
