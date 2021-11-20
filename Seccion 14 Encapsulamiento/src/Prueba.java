public class Prueba {
    public static void main(String[] args) {
        Encapsulamiento prueba=new Encapsulamiento();
        prueba.setNumero1(12);
        prueba.setNumero2(10);
        System.out.println("Numero1: "+prueba.getNumero1());
        System.out.println("Numero1: "+prueba.getNumero2());

        //Se puede mandar a llamar al metodo toString de dos manueras una es de con el ombre del metodo
        System.out.println(prueba.toString());
        //Otra simplemente se imprime el objeto de la instancia
        System.out.println(prueba);
    }

}
