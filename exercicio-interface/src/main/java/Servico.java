public class Servico implements Vendivel{
    private String descricao;
    private Integer codigo;
    private Integer quantHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Integer quantHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.quantHoras = quantHoras;
        this.valorHora = valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public Integer getQuantHoras() {
        return quantHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    @Override
    public Double getValorVenda() {
        return getValorHora() * getQuantHoras();
    }

    @Override
    public String toString() {
        return String.format("\nServiço:\n" +
                "Descrição: %s\n" +
                "Código: %d\n" +
                "Qtd Horas: %d\n" +
                "Valor Hora: R$%.2f\n" +
                "Valor Venda: R$%.2f\n",
                this.descricao, this.codigo, this.quantHoras, this.valorHora, getValorVenda()
        );
    }
}
