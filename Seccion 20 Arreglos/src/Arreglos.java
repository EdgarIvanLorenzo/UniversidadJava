import java.util.Arrays;
//Importacion de los paquetes
import Persona.Persona;
public class Arreglos {
    public static void main(String[] args) {
        //Creacion 1
        int [] enteros=new int[3];
        enteros[0]=10;
        enteros[1]=11;
        enteros[2]=12;
        System.out.println(Arrays.toString(enteros));

        //Creacion 2
        int [] enteros2={20,21,22};
        System.out.println(Arrays.toString(enteros2));

        //Arreglo de tipo Object
        //Creamos un arreglo de tipo Persona ya no de tipo de datos primitivos
        Persona [] personas=new Persona[2];
        personas[0]=new Persona("Edgar ivan",21);
        personas[1]=new Persona("Joel",18);
        System.out.println("Personas, "+Arrays.toString(personas));
        System.out.println("Persona 1: "+personas[0].nombre+" con edad de "+personas[0].edad+" años.");
    }
}
