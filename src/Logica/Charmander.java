package Logica;

public class Charmander extends Pokemon implements IFuego{


    public Charmander() {

    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");

    }

    @Override
    public void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque arañaso");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi ataque puño fuego");

    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi ataque ascuas");

    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("Hola soy Charmander y este es mi ataque lanza llamas");

    }


}
