package EjerciciosPropios;

import java.util.Scanner;

public class Piramide {
    public void Crear(int filas,int columnas){
        int numeroAsteriscos=1;
        int medio= (int) Math.floor(columnas/2);
        for(int i=0;i<filas;i++){
            int copia=numeroAsteriscos;
            for(int j=0;j<columnas;j++){
                if(j>=medio && copia>0){
                    System.out.print("*");
                    copia=copia-1;
                }else{
                    System.out.print(" ");
                }
            }
            numeroAsteriscos=numeroAsteriscos+2;
            medio=medio-1;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int filas;
        int columnas;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        filas=entrada.nextInt();
        columnas=filas*2-1;
        Piramide piramide1=new Piramide();
        piramide1.Crear(filas,columnas);
    }
}
