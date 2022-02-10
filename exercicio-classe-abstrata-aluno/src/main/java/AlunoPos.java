public class AlunoPos extends Aluno{
    private Double nota1;
    private Double nota2;
    private Double notaMonografia;

    public AlunoPos(Integer ra, String nome, Double nota1, Double nota2, Double notaMonografia) {
        super(ra, nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaMonografia = notaMonografia;
    }

    public Double getNota1() {
        return nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    @Override
    public Double calculaMedia() {
        return ((this.nota1 + this.nota2 + this.notaMonografia) / 3);
    }

    @Override
    public String toString() {
        return String.format("%s\n" +
                "Nota1: %.2f\n" +
                "Nota2: %.2f\n" +
                "Nota Monografia: %.2f\n" +
                "Média: %.2f\n", super.toString(), getNota1(), getNota2(), getNotaMonografia(), calculaMedia());
    }
}
