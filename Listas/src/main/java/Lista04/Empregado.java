
package Lista04;


public class Empregado {
    
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double reajuste){
        
        Double valorReajuste = salario * reajuste;
        salario += valorReajuste;
    
    }
    
}
