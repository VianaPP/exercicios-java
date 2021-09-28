
package RecursosHumanos;


public class TesteColaborador {
    
    public static void main(String[] args) {
          
        Colaborador colaborador1 = new Colaborador("Pedro", "Analista Jr",
        5000.0);
        Colaborador colaborador2 = new Colaborador("Marcelo", "Scrum Master", 
        7000.0);
        
        System.out.println(colaborador1);
        System.out.println(colaborador2);
        
        RecursosHumanos rh = new RecursosHumanos();
        
        rh.reajustarSalario(colaborador1, 1.5);
        rh.reajustarSalario(colaborador2, 5.0);
        
        rh.promoverColaborador(colaborador1, "Analista pleno", 6000.00);
        rh.promoverColaborador(colaborador2, "Gestor de Projetos", 12000.00);
        
        
        
    }
}
