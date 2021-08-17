/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.bandtec.listas.Lista02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Login {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String usuario = "admin";
        String senha = "#Bandtec";
        String usuarioDigitado;
        String senhaDigitado;
        Integer login = 0;

        do {
            System.out.println("Digite o Usuario: ");
            usuarioDigitado = leitor.nextLine();

            System.out.println("Digite sua Senha: ");
            senhaDigitado = leitor.nextLine();
            
            if (!usuarioDigitado.equals(usuario)
                    && !senhaDigitado.equals(senha)) {

                System.out.println("Login e Senha Invalidos");
                login = 1;
                break;
            } else{
                System.out.println("Login realizado com sucesso");
            }

        } while (login != 1);


    }
}
