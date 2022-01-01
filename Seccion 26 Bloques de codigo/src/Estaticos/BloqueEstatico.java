package Estaticos;
//Los bloques de codigo son muy parecidos a los decoradoes que existen en lenguajes como typescript
public class BloqueEstatico {
    private final int idPersona;
    private static int contador;

    //los bloques estaticos se ejecutan una unica vez sin importar si existen una instancia
    //los bloques de codigo se ejecutan antes del metodo contructor
    static{ //Primero se ejecuta el bloque static
        System.out.println("Bloque estatico");
        ++BloqueEstatico.contador; //La inicializacion se ejecuta una unica vez
    }

    //Los bloques no estaticos se ejecutan cada vez que existen una nueva instancia
    { //Como segundo paso se ejecuta el bloque no estatico
        System.out.println("Bloque no estatico");
        this.idPersona=BloqueEstatico.contador++;
    }

    //Metodo constructor vacio
    public BloqueEstatico(){ //Como tercer paso se ejecuta el metodo constructor
    }

    //Metodo para retornar el valor del is
    public int getIdPersona(){
        return this.idPersona;
    }

}
