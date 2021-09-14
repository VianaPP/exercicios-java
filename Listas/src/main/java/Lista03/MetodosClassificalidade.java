/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

/**
 *
 * @author Aluno
 */
public class MetodosClassificalidade {

    void classificalidade(Integer idadeUsuario) {

        if (idadeUsuario > 0 && idadeUsuario <= 2) {

            System.out.println("Bebê");

        } else if (idadeUsuario > 2 && idadeUsuario <= 11) {

            System.out.println("Criança");

        } else if (idadeUsuario > 11 && idadeUsuario <= 19) {

            System.out.println("Adolescente");

        } else if (idadeUsuario > 19 && idadeUsuario <= 30) {

            System.out.println("Jovem");

        } else if (idadeUsuario > 30 && idadeUsuario <= 60) {

            System.out.println("Adulto");

        } else {
            
            System.out.println("Idoso");
            
        }
        
    }
}
