
package RecursosHumanos;

public class Colaborador {
    
    private String nome;
    private String cargo;
    private Double salario;

    public Colaborador(String nome, String cargo, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cargo=" + cargo + ", "
                + "salario=" + salario + '}';
    }

    void getSalario(Double valorReajuste) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getCargo(String novoCargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
