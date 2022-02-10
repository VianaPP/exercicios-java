public abstract class Aluno {
    private Integer ra;
    private String nome;

    public Aluno(Integer ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    public Integer getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public abstract Double calculaMedia();

    @Override
    public String toString() {
        return String.format(
                "\nAluno: \n" +
                "RA: %d\n" +
                "Nome: %s", getRa(),getNome());
    }
}
