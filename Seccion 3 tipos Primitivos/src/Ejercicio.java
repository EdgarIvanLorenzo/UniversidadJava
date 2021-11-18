import java.util.Scanner;

public class Ejercicio {
    public Ejercicio(){

    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String nombreProyecto;
        int proyectoId;
        double precioProyecto;
        boolean tipoEnvio;
        System.out.println("Ingrese el nombre: ");
        nombreProyecto=entrada.nextLine();
        System.out.println("Ingrese el id del proyecto: ");
        proyectoId=entrada.nextInt();
        System.out.println("Ingrese el precio del proyecto: ");
        precioProyecto= entrada.nextDouble();
        System.out.println("Ingrese true-->envio es gratuito o false-->envio no es gratuito: ");
        tipoEnvio=entrada.nextBoolean();
        System.out.println("************** Datos del proyecto ****************");
        System.out.println(nombreProyecto+" "+proyectoId+"\n"+"Precio: "+precioProyecto+"\n"+"Envio: "+tipoEnvio);
    }
}
