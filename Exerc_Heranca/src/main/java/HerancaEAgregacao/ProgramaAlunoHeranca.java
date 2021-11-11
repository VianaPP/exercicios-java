package HerancaEAgregacao;

public class ProgramaAlunoHeranca {

    public static void main(String[] args) {
//        Aluno1
        Aluno aluno1 = new Aluno(1211111, "Pedro", 9.8, 10.0);

        System.out.println(String.format("O aluno %s tem média %.2f",
                aluno1.getNome(), aluno1.calcularMedia())
        );

        System.out.println("Exibindo o Objeto aluno1: " + aluno1);

//        Aluno2
        Aluno aluno2 = new Aluno(1213411, "Kenobi", 10.0, 10.0);

        System.out.println(String.format("\nO aluno %s tem média %.2f",
                aluno2.getNome(), aluno2.calcularMedia())
        );

        System.out.println("Exibindo o Objeto aluno2: " + aluno2);

//        Herança
        AlunoPos alunoPos1 = new AlunoPos(8.9, 1223456, "Carol Nasc", 8.9, 9.6);

        System.out.println(String.format("\n\nO aluno %s tem média %.2f",
                alunoPos1.getNome(), alunoPos1.calcularMedia())
        );

        System.out.println("Exibindo o Objeto alunoPos: " + alunoPos1);
        
//        Faculdade
        Faculdade faculdade = new Faculdade("Bandtec", 2);
        
        System.out.println("\n\n Alunos Matriculados na Faculdade: ");
        faculdade.matricularAluno(aluno2);
        faculdade.matricularAluno(alunoPos1);
        faculdade.matricularAluno(aluno1);
        
        faculdade.exibirAlunosmatriculados();
        
        System.out.println("\nDados da Faculdade: ");
        System.out.println(faculdade.toString());

    }
}
