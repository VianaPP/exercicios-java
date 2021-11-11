package com.mycompany.exerc_heranca;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private List<VendedorComissao> vendedores;

    public Departamento() {
        this.vendedores = new ArrayList<>();
    }

    public void adicionaVendedor(VendedorComissao vendedor) {
        if (vendedor != null) {
            this.vendedores.add(vendedor);
        }
    }

    public Double calcularTotalSalario() {
        Double total = 0.0;

        for (VendedorComissao vendedor : vendedores) {
            total += vendedor.calcularSalario();
        }

        return total;
    }

    public void exibirTodos() {
        for (VendedorComissao vendedor : vendedores) {
            System.out.println(vendedor);
        }
    }

    public void exibeSubClsss() {
        System.out.println("\nSo mais fixo");
        for (VendedorComissao vendedor : vendedores) {
            if(vendedor instanceof VendedorComissaoMaisFixo){
            System.out.println(vendedor);
            }
        }
    }
}
