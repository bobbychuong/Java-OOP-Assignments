
public class PokemonTest {

	public static void main(String[] args) {
		Pokemon poke = new Pokemon();
		
		poke.setHealth(100);
//		System.out.println(poke.getHealth());
		Pokemon poke2= new Pokemon("charizard", 2000, "fire");
		System.out.println("Pokemon:" + poke2.getName() + " Type:" + poke2.getType() + " Health:"+ poke2.getHealth());
		
	}

}
