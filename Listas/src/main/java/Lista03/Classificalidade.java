/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Classificalidade {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();
        
        MetodosClassificalidade classificacao = new MetodosClassificalidade();
        
        classificacao.classificalidade(idade);
        
    }
    
}
