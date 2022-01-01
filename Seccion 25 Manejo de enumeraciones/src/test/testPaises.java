package test;
//Importamos la enumeracion
import paises.paises;
public class testPaises {
    public static void main(String[] args) {
        //Accedemos a la enumeracion de Africa para recuperar la capital
                                            //Todo se obtiene la capital de la enumeracion africa
        System.out.println("La capital de africa es: "+paises.Africa.getCapital());

                                                    //Todo se obtiene el numero de paises del continente americano
        System.out.println("El numero de paises en el continente americano es de: "+paises.America.getPaises());
    }
}
