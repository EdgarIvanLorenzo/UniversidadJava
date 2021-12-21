//todo importacion de la clase persona para crear objetos
import Persona.persona;
public class Matricez_Object {
    public static void main(String[] args) {
        //Creacion de una matriz de tipo int
        int[][] enteros={
                {1,2,3},
                {2,3,5}
        };

        //Creacion de una matriz de tipo String
        String [][] cadena={
                {"Apple","Orange"},
                {"Banana","Pineapple"}
        };

        //Creacion de una matriz de tipo persona
        persona[][] personas=new persona[2][2];
        personas[0][0]=new persona("Edgar",21);
        personas[0][1]=new persona("Jose",23);

        //Mandamos a llamar al metodo imprimir
        System.out.println("Cadena");
        Matricez_Object.imprimir(cadena);
        System.out.println("Personas");
        Matricez_Object.imprimir(personas);

    }

    //Los datos de tipo object son los datos String e Instancia de clases o referencia de clases
    //Todo Object=String=Instancias
    public static void imprimir(Object matriz[][]){
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j]!=null){ //Se imprime los datos cuando el valor del arreglo contenga algo esto dirve para los casos donde los datos son instancia de objetos
                    System.out.println(matriz[i][j].toString());
                }
            }
        }
    }
}
