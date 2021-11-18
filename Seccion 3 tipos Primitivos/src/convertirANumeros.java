public class convertirANumeros {
    public static void main(String[] args) {
        //Este clased vamos a ver como convertir datos de tipo string a numeruicos
        String cadena="123";
        //Convertirmos a entero
        int entero=Integer.parseInt(cadena);
        System.out.println("Entero "+entero);
        //Convertir a float
        float flotante=Float.parseFloat(cadena);
        System.out.println("Flotante "+flotante);
        //Convertir String -> double
        double doble=Double.parseDouble(cadena);
        System.out.println("Double "+doble);
    }
}
