public class PasoPorValor {
    public static void main(String[] args) {
        int valor=5;
        System.out.println("El valor en main es: "+valor);
        metodo(valor);
        System.out.println("El valor en main es: "+valor);
    }
    public static void metodo(int valor){
        System.out.println("El valor es: "+valor);
        //Solo se realiza el cambio a la variable local
        valor=10;
        System.out.println("El nuevo valor es: "+valor);
    }
}
