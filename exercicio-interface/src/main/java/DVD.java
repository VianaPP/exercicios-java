public class DVD extends Produto{
    private String gravadora;

    public DVD(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto, nome);
        this.gravadora = gravadora;
    }

    public String getGravadora() {
        return gravadora;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() + (getPrecoCusto() * 0.20);
    }

    @Override
    public String toString() {
        return String.format("\n%s" +
                "Gravadora: %s\n" +
                "Valor de Venda: R$%.2f\n",
                super.toString(), this.gravadora, getValorVenda()
        );
    }
}
