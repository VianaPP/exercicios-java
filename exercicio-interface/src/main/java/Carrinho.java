import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Vendivel> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void exibirtodos(){
        for (Vendivel v: itens){
            System.out.println(v);
        }
    }

    public void adicionarVendavel(Vendivel v){
        itens.add(v);
    }

    public Double calcularTotalVenda(){
        Double totalVendas = 0.0;
        for (Vendivel v: itens){
            totalVendas += v.getValorVenda();
        }

        return totalVendas;
    }

    public void exibirItensCarrinhos(){
        for (Vendivel v: itens){
            System.out.println(v);
        }
    }

}
