package Test;
//Importamos la clase del mismo proyecto pero de diferente paquete
import Utileria.Utilerias; //Importamos la clase del paquete de Utileria


public class test {
    //Metodo main
    public static void main(String[] args) {
        //Ejecucion del metodo estatico
        System.out.println(Utilerias.Saludo("Hola Mundo"));
    }
}
