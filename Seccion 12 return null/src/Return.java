public class Return {
    //Metodo main que es el ejecutable en la clase
    public static void main(String[] args) {
        //Mandamos a llamar al metodo statico que pertenece a la clase
        System.out.println(suma(9,3));
    }
    //Metodo estatico
    public static int suma(int numero1, int numero2){
        return numero1+numero2;
    }
}
