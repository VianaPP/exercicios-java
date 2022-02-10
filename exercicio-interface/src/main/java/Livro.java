public class Livro extends Produto{
    private String autor;
    private String isbn;

    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto, nome);
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public Double getValorVenda() {
        return getPrecoCusto() + (getPrecoCusto() * 0.10) ;
    }

    @Override
    public String toString() {
        return String.format("\n%s" +
                "Autor: %s\n" +
                "ISBN: %s\n" +
                "Valor Da Venda: R$%.2f\n",
                super.toString(), this.autor, this.isbn, getValorVenda()
        );
    }
}
