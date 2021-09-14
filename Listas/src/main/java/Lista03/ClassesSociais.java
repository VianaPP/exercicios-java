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
public class ClassesSociais {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sua renda: ");
        Double renda = leitor.nextDouble();

        MetodosClassesSociais classe = new MetodosClassesSociais();
        
        Double salariosMins = classe.calculoQtdSalariosMin(renda);
        String tipoClasse = classe.classePertencente(renda);

        System.out.println(String.format("Você recebe aproximadamente %.1f "
                + "salários mínimos", salariosMins));
        
        System.out.println(String.format("Você pertence a classe social: %s"
                , tipoClasse));
    }

}
