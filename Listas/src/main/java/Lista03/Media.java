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
public class Media {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota do aluno: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno: ");
        Double nota2 = leitor.nextDouble();
        
        CalculoMedia media = new CalculoMedia();
        
        System.out.println("A media do aluno é : " + 
                media.calcularMedia(nota1, nota2));
    }

}
