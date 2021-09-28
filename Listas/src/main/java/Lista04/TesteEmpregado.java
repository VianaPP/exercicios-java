package Lista04;

public class TesteEmpregado {

    public static void main(String[] args) {

        Empregado joao = new Empregado();
        
        joao.nome = "João";
        joao.salario = 5.400;
        joao.cargo = "Analista de Sistemas";
        joao.reajustarSalario(0.15);

        System.out.println(String.format("Nome: %s\n"
                + "Cargo: %s\n"
                + "Salario Reajustado: %.2f\n", 
                joao.nome, joao.cargo, joao.salario));

    }
}
