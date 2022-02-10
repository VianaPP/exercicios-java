public class App {

    public static void main(String[] args) {
        Aluno aluno1 = new AlunoPos(1231, "Kennedy",8.9, 4.5, 6.3);
        Aluno aluno2 = new AlunoGraduacao(12555531, "Pedro",3.2, 4.5);
        Aluno aluno3 = new AlunoFundamental(123221, "Roger",6.0, 7.4, 3.6, 8.6);
        Aluno aluno4 = new AlunoFundamental(3324, "Zéfilho",8.0, 5.7, 4.3, 7.8);

        Escola e1 = new Escola("Sptech");

        e1.adicionarAluno(aluno1);
        e1.adicionarAluno(aluno2);
        e1.adicionarAluno(aluno3);
        e1.adicionarAluno(aluno4);

        System.out.println("Exibindo Todos Alunos");
        e1.exibiTodos();
        System.out.println("_______________\n\n\n");

        System.out.println("Buscando aluno pelo ra");
        e1.buscarAluno(3324);
        System.out.println("_______________\n\n\n");

        System.out.println("Exibindo alunos de graduação");
        e1.exibiAlunosGraduacao();
        System.out.println("_______________\n\n\n");

        System.out.println("Exibindo alunos Aprovados");
        e1.exibiAprovados();
        System.out.println("_______________\n\n\n");



    }
}
