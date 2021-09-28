package RecursosHumanos;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalReajustes;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalReajustes = 0;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public Integer getTotalReajustes() {
        return totalReajustes;
    }

    public void reajustarSalario(Colaborador funcionario, Double valorReajuste) {

        funcionario.setSalario(funcionario.getSalario() * valorReajuste);
        this.totalReajustes++;

    }

    public void promoverColaborador(Colaborador funcionario, String novoCargo,
            Double novoSalario) {

        if (funcionario.getSalario() > novoSalario) {
            System.out.println("Operação Inválida");
        } else {
            funcionario.setCargo(novoCargo);
            funcionario.setSalario(novoSalario);
            totalPromovidos++;
        }
    }

}
