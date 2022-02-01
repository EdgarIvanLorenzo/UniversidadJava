package thrown;

import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero1=10,resultado=0;
        int numero2=entrada.nextInt();

        try{
            if(numero2==0){
                //Todo Creacion de un mensaje de Exception
                throw new Exception("No puede dividir entre 0");
            }else{
                resultado=numero1/numero2;
                System.out.println("El resultado es: "+resultado);
            }
            //Todo Se recibe el mensaje de exception
        }catch (Exception e){
            //Todo Se imprime el mensaje de error
            e.printStackTrace();
        }

        System.out.println("**** Fin del codigo ****");
    }
}
