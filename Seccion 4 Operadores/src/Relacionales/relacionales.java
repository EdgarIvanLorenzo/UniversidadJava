package Relacionales;

public class relacionales {
    public static void main(String[] args) {
        String cadena1="Hola";
        String cadena2="Hola";


        //Con el operador de comparacion igualdad estamos comparando la referencia de objeto
        System.out.println("Comparamos la referencia de objetos");
        System.out.println("La cadena 1==cadena 2: "+(cadena1==cadena2));


        //Comparamos la referencia de contenido con el metodo equals
        System.out.println("Comparamos la referencia de contenido");
        System.out.println("(cadena1.equals(cadena2)) = " + (cadena1.equals(cadena2)));
    }
}
