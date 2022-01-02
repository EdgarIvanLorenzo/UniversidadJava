package protegido;

class test {
    public static void main(String[] args) {
        //Creacion de referencia a Persona
        Persona persona1=new Persona("Edgar Ivan",21);
        System.out.println(persona1);

        //Referencia a empleado
        Empleado empleado1=new Empleado("Kevin",18);
        System.out.println(empleado1);
        //accedemos a los datos protegidos con herencia
        System.out.println(empleado1.nombre);
    }
}
