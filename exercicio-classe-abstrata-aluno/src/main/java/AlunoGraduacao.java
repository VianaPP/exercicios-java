public class AlunoGraduacao extends Aluno{
    private Double nota1;
    private Double nota2;

    public AlunoGraduacao(Integer ra, String nome, Double nota1, Double nota2) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    @Override
    public Double calculaMedia() {
        return (this.nota1 * 0.4 + this.nota2 * 0.6);
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Nota1: %.2f\n" +
                "Nota2: %.2f\n" +
                "Média: %.2f\n", super.toString(), getNota1(), getNota2(), calculaMedia());
    }
}
