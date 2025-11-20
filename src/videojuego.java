import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class videojuego {
    public static void main(String[] args) {
        pokemon1 pokemon1 = new pokemon1("Pikachu", "Electrico");
        pokemon2 pokemon2 = new pokemon2("Squirtle","Agua");
        int option = 0;
        while (option !=5){
        System.out.println("Hola!, elige que quieres hacer.");
        System.out.println("-------------------------------");
        System.out.println("1.Ver tus pokemons");
        System.out.println("2.Dar de comer a tus pokemons");
        System.out.println("3.Dar pociones a tus pokemons");
        System.out.println("4.Luchar con tus pokemons");
        System.out.println("5.Salir");
        System.out.println("-------------------------------");
        Scanner scanner = new Scanner(System.in);

        option = scanner.nextInt();

        if (option == 1) {
            System.out.println(pokemon1.getNombre() + " es de tipo " + pokemon1.getTipo() + ", tiene de velocidad " + pokemon1.getVelocidad() + ", " + "tiene " + pokemon1.getPs() + " de vida y " + pokemon1.getAtaque() + " de ataque ");
            System.out.println(pokemon2.getNombre() + " es de tipo " + pokemon2.getTipo() + ", tiene de velocidad " + pokemon2.getVelocidad() + ", " + "tiene " + pokemon2.getPs() + " de vida y " + pokemon2.getAtaque() + " de ataque ");
        }
        if (option == 2){
            System.out.println("Elige que pokemon quieres dar de comer: "+"1."+pokemon1.getNombre()+" o "+"2."+pokemon2.getNombre());
          int eleccionpokemon = scanner.nextInt();
          if(eleccionpokemon == 1){
              System.out.println("Que quieres darle de comer a "+pokemon1.getNombre()+", 1.Bayas o 2.beber Agua");
              int eleccioncomida = scanner.nextInt();
              if(eleccioncomida == 1){
              pokemon1.comerBayas();
                  System.out.println(pokemon1.getNombre()+" comio bayas");}
                else if(eleccioncomida==2){
                    pokemon1.beberAgua();
                  System.out.println(pokemon1.getNombre()+" bebio agua");

              }
          }else if (eleccionpokemon == 2){
              System.out.println("Que quieres darle de comer a "+pokemon2.getNombre()+", 1.Bayas o 2.Beber Agua");
              int eleccioncomida = scanner.nextInt();
              if(eleccioncomida == 1){
                  pokemon2.comerBayas();
                  System.out.println(pokemon2.getNombre()+" comio bayas");}
              else if(eleccioncomida==2){
                  pokemon2.beberAgua();
                  System.out.println(pokemon2.getNombre()+" bebio agua");


              }}}

        if (option == 3 ){
            System.out.println("Elige que pokemon quieres dar una poción: "+"1."+pokemon1.getNombre()+" o "+"2."+pokemon2.getNombre());
            int eleccionpokemon = scanner.nextInt();
            if(eleccionpokemon == 1){
                System.out.println("Que poción quieres darle a "+pokemon1.getNombre()+", 1.Vida o 2.Daño");
                int eleccionpocion = scanner.nextInt();
                if(eleccionpocion == 1){
                    pokemon1.tomarPocionVida();
                    System.out.println(pokemon1.getNombre()+" obtuvo más vida");}
                else if(eleccionpocion==2){
                    pokemon1.tomarPocionDaño();
                    System.out.println(pokemon1.getNombre()+" obtuvo más daño");

                }
            }else if (eleccionpokemon == 2){
                System.out.println("Que poción quieres darle a "+pokemon2.getNombre()+", 1.Vida o 2.Daño");
                int eleccionpocion = scanner.nextInt();
                if(eleccionpocion == 1){
                    pokemon2.tomarPocionVida();
                    System.out.println(pokemon2.getNombre()+" obtuvo más vida");}
                else if(eleccionpocion==2){
                    pokemon2.tomarPocionDaño();
                    System.out.println(pokemon2.getNombre()+" obtuvo más daño");


                }}}
        if (option == 4){
            System.out.println("Elige a tu pokemon "+"1."+pokemon1.getNombre()+" o "+"2."+pokemon2.getNombre());
            int eleccionpokemon = scanner.nextInt();
            if(eleccionpokemon == 1){
                option = 0;
                while(option !=3) {
                    System.out.println("--------------------");
                    System.out.println("Elige que quieres hacer:");
                    System.out.println("1.Atacar");
                    System.out.println("2.Tomar pocion");
                    System.out.println("3.Huir");
                    System.out.println("--------------------");
                System.out.println(pokemon1.getNombre() + " es de tipo " + pokemon1.getTipo() + ", tiene de velocidad " + pokemon1.getVelocidad() + ", " + "tiene " + pokemon1.getPs() + " de vida y " + pokemon1.getAtaque() + " de ataque ");
                System.out.println(pokemon2.getNombre() + " es de tipo " + pokemon2.getTipo() + ", tiene de velocidad " + pokemon2.getVelocidad() + ", " + "tiene " + pokemon2.getPs() + " de vida y " + pokemon2.getAtaque() + " de ataque ");
                option = scanner.nextInt();}


                if(option ==1){
                    if(pokemon1.getVelocidad()> pokemon2.getVelocidad()){
                        pokemon1.realizarAtacar();
                        pokemon2.atacar();
                    }else if(pokemon2.getVelocidad()>pokemon1.getVelocidad()){
                        pokemon2.atacar();
                        pokemon1.realizarAtacar();

                    }

                if(option==2){
                    System.out.println("Elige que pocion quieres usar: 1.Pocion de vida o 2.Pocion de daño");
                    if(option ==1)pokemon1.tomarPocionVida();
                    else{pokemon1.tomarPocionDaño();}
                }

                }

            else if(eleccionpokemon==2){
                    System.out.println("fndnoas");

                }
            }}




            if(option==5){
            System.out.println("Adios!");
        }
}}}
