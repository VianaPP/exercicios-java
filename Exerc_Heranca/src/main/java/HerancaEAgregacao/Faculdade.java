package HerancaEAgregacao;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno aluno) {
        if (aluno != null) {
            if (this.vagas > 0) {
                listaAlunos.add(aluno);
                this.vagas--;
            }
        }

    }

    public void exibirAlunosmatriculados() {
        if (listaAlunos.isEmpty()) {
            System.out.println(String.format("A faculdade %s não possui"
                    + "alunos cadastrados.", this.nome));
        } else {
            for (Aluno AlunoDaVez : listaAlunos) {
                System.out.println(AlunoDaVez);
            }
        }
    }

    public void exibirAlunoPos() {
        if (listaAlunos.isEmpty()) {
            System.out.println(String.format("A faculdade %s não possui"
                    + "alunos cadastrados.", this.nome));
        } else {

            for (Aluno AlunoDaVez : listaAlunos) {
                if (AlunoDaVez instanceof AlunoPos) {
                    System.out.println(AlunoDaVez.toString());
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Faculdade: %s\n"
                + "Vagas disponiveis: %d\n"
                + "Alunos Matriculados: %s", 
                this.nome,
                this.vagas,
                listaAlunos);
    }
    
    

}
