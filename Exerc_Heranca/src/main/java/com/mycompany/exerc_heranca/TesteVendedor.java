
package com.mycompany.exerc_heranca;

public class TesteVendedor {
    
    public static void main(String[] args) {
        VendedorComissao comissao = new VendedorComissao(2, "Pedro", 
                1000.0, 5.0);
        
        VendedorComissaoMaisFixo salario = new VendedorComissaoMaisFixo
        (1000.0, 3, "Giu", 200.0, 20.0);
        
        Departamento dep = new Departamento();
        
                
        dep.adicionaVendedor(comissao);
        dep.adicionaVendedor(salario);
        
        System.out.println("Total a ser pago: " + dep.calcularTotalSalario());
        dep.exibirTodos();
        dep.exibeSubClsss();
        
//        System.out.println(comissao);
//        System.out.println("----");
//        System.out.println(salario);
    }
    
}
