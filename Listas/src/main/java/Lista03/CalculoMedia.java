/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista03;

/**
 * Crie uma classe Java e escreva um método chamado calcularMedia, que recebe
 * duas notas e retorna a média das notas, como é calculada a média da Faculdade
 * Bandtec (nota1 * 0.4 + nota2 * 0.6). No método main, solicite que o usuário
 * digite 2 notas, chame o método calcularMedia passando as notas digitadas como
 * argumento e exiba o valor retornado pelo método.
 */

public class CalculoMedia {

    Double calcularMedia(Double num1, Double num2) {
        
        Double media = (num1 * 0.4 + num2 * 0.6);
       
        return media;

    }

}
