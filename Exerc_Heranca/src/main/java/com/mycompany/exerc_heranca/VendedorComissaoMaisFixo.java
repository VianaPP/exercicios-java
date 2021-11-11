
package com.mycompany.exerc_heranca;


public class VendedorComissaoMaisFixo extends VendedorComissao{
    
    private Double salarioFixo;

    public VendedorComissaoMaisFixo(Double salarioFixo, Integer codigo, 
            String nome, Double vendas, Double taxa) {
        super(codigo, nome, vendas, taxa);
        this.salarioFixo = salarioFixo;
    }

    public Double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(Double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    @Override
    public String toString() {
        return "VendedorComissaoMaisFixo{" + "salarioFixo=" + salarioFixo + '}';
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + this.salarioFixo;
    }
    
    
    
    
}
