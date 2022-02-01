//importacion de las clases del paquete Clases
import clases.*;
public class test {
    public static void main(String[] args) {
        //Creacion de un objeto de tipo Empleado
        Empleado gerente1=new Gerente("Edgar",21,TipoGerente.General);
        System.out.println(gerente1); //No se puede acceder a metodos de la clase hija

        //Todo se castea a un tipo Gerente
        //Todo Padre--->Hija
        Gerente gerenteCasting=(Gerente) gerente1;
        System.out.println(gerenteCasting.obtenerGerente());


        //Todo casting de Hija a una clase Padre
        System.out.println(((Empleado) gerenteCasting).toString());

        Gerente gerente2=new Gerente("Edgar Ivan",21,TipoGerente.General);
        System.out.println(gerente1.Comprobar(gerente2));
    }
}
