public class Main {
    //Clase para probar las clases Empleado y Persona
    public static void main(String[] args) {
        //Creacion de una Persona
        Persona p=new Persona("Edgar","Lorenzo",21);
        System.out.println(p); //Mandamos a llamar al metodo toString

        //Creacion de una Empleado
        Empleado e=new Empleado("Edgar","Lorenzo",21,"Ropa");
        System.out.println(e); //Mandamos a llamar al metodo toString


        //Acceder a metodos estaticos
        Persona.Saludo();
    }
}
