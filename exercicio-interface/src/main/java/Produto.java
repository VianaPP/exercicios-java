public abstract class Produto implements Vendivel{
    private Integer codigo;
    private Double precoCusto;
    private String nome;

    public Produto(Integer codigo, Double precoCusto, String nome) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    @Override
    public String toString() {
        return String.format("\nProduto:" +
                        "Nome: %s\n" +
                "Código: %d\n" +
                "Preço de Custo: R$%.2f\n", this.nome,
                this.codigo, this.precoCusto);
    }
}
