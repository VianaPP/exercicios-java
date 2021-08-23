/*¨
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.nivelamento2;

/**
 *
 * @author Aluno
 */
public class ContadorVariado {

    public static void main(String[] args) {
        Double num = 0.0;
        for (int i = 0; i < 33; i++) {
            num += 0.15;
            System.out.println(String.format("%.2f\n", num));
        }

    }

}
