public class Ejemplo {
    public static void main(String[] args) {
        //A esto se le conoce como autoboxing a la conversion de metodos del tipo de metodos
        Integer numero=10; //Tipo Integer no tipo int
        System.out.println(numero.byteValue()); //Comvversion a tipo byte con el tipo Integer

        //Concepto de unboxing
        int unboxing=numero;
        float flotante=(float) unboxing; //Conversion a flotante
        System.out.println(unboxing); //Impresion de dato de tipo primitivo
    }
}

