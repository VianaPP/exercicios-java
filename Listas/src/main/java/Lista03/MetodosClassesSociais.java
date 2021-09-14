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
public class MetodosClassesSociais {

    Double calculoQtdSalariosMin(Double salario) {
        Double qtdSalariosMin = salario / 1100;

        return qtdSalariosMin;
    }

    String classePertencente(Double salario) {

        String tipoClasse = "";
        Double renda = calculoQtdSalariosMin(salario);

        if (renda <= 2) {

            tipoClasse = "E";

        } else if (renda > 2 && renda <= 4) {

            tipoClasse = "D";

        } else if (renda > 4 && renda <= 10) {

            tipoClasse = "C";

        } else if (renda > 10 && renda <= 20) {

            tipoClasse = "B";

        } else {

            tipoClasse = "A";

        }

        return tipoClasse;
    }

}
