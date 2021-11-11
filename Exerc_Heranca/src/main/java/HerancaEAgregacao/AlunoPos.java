
package HerancaEAgregacao;

public class AlunoPos extends Aluno{
    private Double notaMonografia;

    public AlunoPos(Double notaMonografia, Integer ra, String nome, 
            Double notaContinuada, Double notaSemestral) {
        super(ra, nome, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }
    
    

    @Override
    public Double calcularMedia() {
        return (super.calcularMedia()+ this.notaMonografia) /3; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "Nota Monografia: %.2f", 
                super.toString(), this.notaMonografia);
    }
    
    
    

    
    
    
}
