/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.listas.Lista02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Loteria {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero de 0 a 10");
        Integer numEscondido = leitor.nextInt();

        for (int i = 0; ; i++) {

            Integer numeroAle = ThreadLocalRandom.current().nextInt(0, 10);
            System.out.println(String.format("Numero sorteado: %d", numeroAle));

            if (numeroAle == numEscondido) {

                System.out.println("Descobri!! ¬¬");

                if (i <= 3) {
                    System.out.println("Você é MUITO sortudo");
                    break;
                } else if (i > 3 && i <= 10) {
                    System.out.println("Você é sortudo");
                    break;
                } else {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                    break;
                }
            }

        }

    }
}
