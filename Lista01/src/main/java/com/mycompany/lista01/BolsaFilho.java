/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista01;

import java.util.Scanner;

/**
 *
 *
 * R$25,12 por filhos com menos de 4 anos R$15,88 por filhos entre 4 e 16 anos
 * R$12,44 por filhos entre 17 e 18 anos Exiba uma frase como esta: "Você tem um
 * total de T filhos e vai receber R$B de bolsa" Use interpolação com 2 casas
 * decimais para o valor da bolsa
 */
public class BolsaFilho {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem vindo ao, Calculador de Bolsa Filhos do"
                + "País Quisito! \n");
        System.out.println("Para iniciarmos pedizamos que informe: \n"
                + "Quantos filhos de 0 a 3 anos você possui?");
        Double filhos0a3 = leitor.nextDouble();
        System.out.println("\n");

        System.out.println("Legal!, e quantos filhos de 3 a 16 anos "
                + "você possui? ");
        Double filhos4a16 = leitor.nextDouble();
        System.out.println("\n");

        System.out.println("Por ultimo, quantos filho de 17 a 18 "
                + "você possui?");
        Double filhos17a18 = leitor.nextDouble();
        System.out.println("\n");

        Double bolsa0a3 = filhos0a3 * 25.12;
        Double bolsa4a16 = filhos4a16 * 15.88;
        Double bolsa17a18 = filhos17a18 * 14.44;
        
        Double totalFilhos = filhos0a3 + filhos4a16 + filhos17a18;  
        Double totalBolsa = bolsa0a3 + bolsa4a16 + bolsa17a18;
        
        System.out.println("CALCULANDO...");
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(String.format("total de %.0f filhos e vai receber "
                + "R$%.2f de bolsa", totalFilhos, totalBolsa));

    }

}
