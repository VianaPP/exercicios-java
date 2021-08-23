/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Pizza {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Para votar no sabor Mussarela digite 5");
        System.out.println("Para votar no sabor Calabresa digite 25");
        System.out.println("Para votar no sabor 4 Queijos digite 50");

        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;
        Integer totalV = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Digite seu voto: ");
            Integer voto = leitor.nextInt();
            totalV += 1;

            if (voto == 5) {
                mussarela++;
            } else if (voto == 25) {
                calabresa++;
            } else {
                quatroQueijos++;
            }

        }
        
        System.out.println("Total de Votos: " +totalV );

        if (mussarela > calabresa && mussarela > quatroQueijos) {
            System.out.println("Mussarela é o sabor favorito do pessoal!");
        } else if (calabresa > mussarela && calabresa > quatroQueijos) {
            System.out.println("Calabresa é o sabor favorito do pessoal!");
        } else {
            System.out.println("Quatro Queijos é o sabor favorito do pessoal!");
        }

    }
}
