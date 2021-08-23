/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. S
 */
package com.br.bandtec.nivelamento2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        Integer base = leitor.nextInt();

        System.out.println("Digite o valor do expoente: ");
        Integer expoente = leitor.nextInt();

        Integer result = base;

        for (int i = 1; i < expoente; i++) {
            
            result = result * base;

        }

        System.out.println("este é o resultado: " + result);
    }

}
