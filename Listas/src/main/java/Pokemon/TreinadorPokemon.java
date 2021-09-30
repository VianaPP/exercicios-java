package Pokemon;


public class TreinadorPokemon {

    private String nome;
    private Integer nivel;

    public TreinadorPokemon(String nome, Integer nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void treinarPokemon(Pokemon nomePokemon) {

        Double forca = nomePokemon.getForca();
        nomePokemon.setForca((forca * 0.1) + forca);
        
        nomePokemon.setDoces(nomePokemon.getDoces() + 10.0);
        
        this.nivel += 2;
    }

    public void evoluirPokemon(Pokemon nomePokemon, String nomeEvolucao) {
        
        if (nomePokemon.getDoces() >= 50) {
            
            nomePokemon.setNome(nomeEvolucao);
            nomePokemon.setDoces(nomePokemon.getDoces() - 50);
            this.nivel += 10;
            
            System.out.println(String.format("Pokémon %s evoluiu para -> %s",
                    nomePokemon.getNome(), nomeEvolucao));
            
        } else {
            System.out.println("Não foi possível realizar operação");
        }

    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" + "nome=" + nome + ", nivel=" + nivel + '}';
    }
    
    

}
