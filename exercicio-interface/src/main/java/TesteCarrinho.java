import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteCarrinho {

    public static void main(String[] args) {
        Carrinho c = new Carrinho();
        Scanner leitor = new Scanner(System.in);
        Scanner leitor2 = new Scanner(System.in);


        Integer indice = 1;
        String simNao;
        String livro;
        String DVD;
        String servico;
        do {

            System.out.println("\nSelecione uma opção:\n");

            System.out.println("1 - Adicionar um livro;\n");
            System.out.println("2 - Adicionar um DVD;\n");
            System.out.println("3 - Adicionar um Serviço;\n");
            System.out.println("4 - Exibir Itens do Carrinho;\n");
            System.out.println("5 - Total de Preço de Vendas;\n");
            System.out.println("6 - Sair;\n");
            indice = leitor.nextInt();

            if (indice == 1) {
                System.out.println("\nDigite o Nome do Livro que deseja Adicionar:");
                livro = leitor2.nextLine();

                Produto p1 = new Livro(1234, 10.0, livro, "Whinderson Nunes", "AAABDD");
                c.adicionarVendavel(p1);

                System.out.println("Item Adicionado com sucesso deseja continuar? (S/N)\n");
                simNao = leitor2.nextLine();
                if (simNao.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (indice == 2) {
                System.out.println("\nDigite o Nome do DVD que deseja Adicionar:");
                DVD = leitor2.nextLine();

                Produto p2 = new DVD(4567, 7.50, DVD, "DreamWorks");
                c.adicionarVendavel(p2);

                System.out.println("Item Adicionado com sucesso deseja continuar? (S/N)\n");
                simNao = leitor2.nextLine();
                if (simNao.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (indice == 3) {
                System.out.println("\nDigite o Nome do Serviço que deseja Adicionar:");
                DVD = leitor2.nextLine();

                Servico serv = new Servico("Colocar Piso", 5555, 4, 30.0);
                c.adicionarVendavel(serv);

                System.out.println("Item Adicionado com sucesso deseja continuar? (S/N)\n");
                simNao = leitor2.nextLine();
                if (simNao.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (indice == 4) {
                System.out.println("\nExibindo todos os itens do seu carrinho:");

                c.exibirtodos();

                System.out.println("Sucesso deseja continuar? (S/N)\n");
                simNao = leitor2.nextLine();
                if (simNao.equalsIgnoreCase("n")) {
                    break;
                }
            } else if (indice == 5) {
                System.out.printf("\nExibindo o Total de Preço de Vendas: %.2f\n" ,c.calcularTotalVenda());

                System.out.println("Sucesso deseja continuar? (S/N)\n");
                simNao = leitor2.nextLine();
                if (simNao.equalsIgnoreCase("n")) {
                    break;
                }
            } else {
                indice = 0;
            }


        } while (indice != 0);


    }
}
