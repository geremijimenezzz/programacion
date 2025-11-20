public class videojuego {
    public static void main(String[] args) {
        pokemon1 pokemon1 = new pokemon1("Pikachu", "Electrico");
        pokemon2 pokemon2 = new pokemon2("Squirtle","Agua");
        System.out.println(pokemon1.getNombre()+ " es de tipo " + pokemon1.getTipo()+", tiene de velocidad "+ pokemon1.getVelocidad()+", "+ "tiene "+pokemon1.getPs()+" de vida y "+pokemon1.getAtaque()+" de ataque ");
        System.out.println(pokemon2.getNombre()+ " es de tipo " + pokemon2.getTipo()+", tiene de velocidad "+ pokemon2.getVelocidad()+", "+ "tiene "+pokemon2.getPs()+" de vida y "+pokemon2.getAtaque()+" de ataque ");


        System.out.println(pokemon1.getNombre()+" luchara contra: "+ pokemon2.getNombre());


    }


}
