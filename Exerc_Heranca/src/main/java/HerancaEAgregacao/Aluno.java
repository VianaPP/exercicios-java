
package HerancaEAgregacao;


public class Aluno {
    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String nome, Double notaContinuada,
            Double notaSemestral) {
        this.ra = ra;
        this.nome = nome;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public String getNome() {
        return nome;
    }
    
    
    public Double calcularMedia(){
        
        Double media = 0.0;
        media = this.notaContinuada * 0.4 + this.notaSemestral * 0.6;
        
        return media;
    }

    @Override
    public String toString() {
        return String.format("\nAluno:\nRa: %s\n"
                + "Nome: %s\n"
                + "Nota Continuada: %.2f\n"
                + "Nota Semestral: %.2f\n"
                + "Media: %.2f\n",
                this.ra,
                this.nome,
                this.notaContinuada,
                this.notaSemestral,
                calcularMedia());
    }
    
    
    
}
