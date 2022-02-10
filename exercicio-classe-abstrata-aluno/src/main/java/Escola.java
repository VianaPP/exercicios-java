import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> alunos;
    private String nome;

    public Escola(String nome) {
        this.alunos = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarAluno(Aluno a) {
        this.alunos.add(a);
    }

    public void exibiTodos() {
        for (Aluno a : alunos) {
            System.out.println(a.toString());
        }
    }

    public void exibiAlunosGraduacao() {
        for (Aluno a : alunos) {
            if (a instanceof AlunoGraduacao) {
                System.out.println(a.toString());
            }
        }
    }

    public void exibiAprovados() {
        for (Aluno a : alunos) {
            if (a.calculaMedia() >= 6) {
                System.out.println(a.toString());
            }
        }
    }

    public void buscarAluno(Integer ra) {
        Boolean validacao = false;
        for (Aluno a : alunos) {
            if (a.getRa().equals(ra)) {
                System.out.println(a.toString());
                validacao = true;
            }
        }
        if (!validacao) {
            System.out.println("Aluno não encontrado");
        }
    }


}
