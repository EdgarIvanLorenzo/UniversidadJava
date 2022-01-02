package privado;

public class test {
    public static void main(String[] args) {
        Electronicos computadora=new Electronicos("Computadora",20000,"Dell");
        System.out.println(computadora);

        //Aceso a datos protected
        //Todo protected
        System.out.println(computadora.nombre);

        //todo private
        computadora.mensajePublic(); //Este metodo ejecuta un metodo privado de la clase
    }
}
