public class convertirAString {
    public static void main(String[] args) {
        //Es esta clase vamos a ver como convertir un dato de tipo numerico a String
        int entero=123;
        float flotante= (float) 3.4;
        double doble = 23.34;
        //Convertir entero ---> String
        String cadena="";
        cadena=String.valueOf(entero);
        System.out.println("Entero--->String: "+cadena);
        cadena=String.valueOf(doble);
        System.out.println("Double--->String: "+cadena);
    }
}
