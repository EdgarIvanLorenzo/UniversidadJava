package Condicionales;

import java.util.Scanner;

public class mayorEdad{
    public static void exepcion() throws error{
        throw new error("El dato no es entero");
    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edad;
       try {
           System.out.println("Ingrese la edad de la persona: ");
           edad= entrada.nextInt();
           //Obtenemos el tipo de dato de la variable de tipo entero
           String nombre=((Object)edad).getClass().getSimpleName();
           //Comparamos el contenido del texto
          if(nombre.equals("Integer")){
               if(edad>=18){
                   System.out.println("La persona es mayor de edad");
               }else{
                   System.out.println("La persona es menor de edad");
               }
          }else{
              exepcion();
          }
       }catch (error e){
           System.out.println(e.getMessage());
       }
    }
}
