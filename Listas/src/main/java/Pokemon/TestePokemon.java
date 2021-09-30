package Pokemon;

public class TestePokemon {

    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", "Eletrico", 30.7, 0.0);
        Pokemon pokemon2 = new Pokemon("Crocodalie", "Aquatico", 20.9, 0.0);

        TreinadorPokemon treinar = new TreinadorPokemon("Axe", 0);

        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);
        treinar.treinarPokemon(pokemon1);

        System.out.println(pokemon1);

        treinar.evoluirPokemon(pokemon1, "Raiochu");

        System.out.println(pokemon1);

        treinar.treinarPokemon(pokemon2);
        treinar.treinarPokemon(pokemon2);

        System.out.println(pokemon2);
        
        treinar.evoluirPokemon(pokemon2, "Krokorok");
        
        System.out.println(treinar);
        
    }
}
