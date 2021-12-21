import java.util.Arrays;

public class sumaColumnas {
    public static void main(String[] args) {
        //Creacion de una matriz de tipo entero
        int[][] matriz={
                {1,3,4},
                {0,5,9},
                {5,1,1}
        };


        //Recorrido de las columnas para su respectiva suma
        int i=0; //Variable que representa la columna
        int j=0; //Variable que representa las filas
        while(i<3){ //Termina cuando recorras todas las filas
            //Suma de las posiciones de cada una de los arreglos interiores
            int suma=matriz[j][i]+matriz[j+1][i]+matriz[j+2][i];
            //Impresion del resultado
            System.out.println(suma);
            //Aumento de la columna
            i++;
        }


        //Imprimir una matriz
        System.out.println(Arrays.toString(matriz[0])); //Para imprimir una rreglo con el metodo Arrays.toString debemos de mandarle un arreglo
    }
}
