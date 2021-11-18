public class operadorTernario {
    public operadorTernario(){}
    public static void main(String[] args) {
        String resultado= ("Hola"=="Hola") ? "El valor es verdadero" : "El valor no es verdadero";
        System.out.println(resultado);
        //Evaluemos la cadena lo comparamos con el metodo equals
        boolean evaluarCadena= "Hola"=="Hola";
        System.out.println(evaluarCadena);
    }
}
