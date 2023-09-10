import Logica.Bulbasaur;
import Logica.Charmander;
import Logica.Pikachu;
import Logica.Squirtle;

public class Main {
    public static void main(String[] args) {

        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        Squirtle squirtle = new Squirtle();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();

        charmander.atacarAraniazo();
        charmander.atacarLanzaLLamas();

        pikachu.atacarAraniazo();
        pikachu.atacarRayo();

        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();



    }
}