import java.util.Scanner;

public class ejercicioSistemaCalificaciones {
    public static void main(String[] args) {
        float calificacion;
        String resultado="";
        Scanner entrada=new Scanner(System.in); //creación del objeto Scanner
        System.out.println("Ingrese la calificacion del alumno");
        calificacion= entrada.nextFloat(); //Peticion de la calificacion

        //Sentencias
        if(calificacion>=0 && calificacion<6){
            resultado="F";
        }else if(calificacion>=6 && calificacion<7){
            resultado="D";
        }else if(calificacion>=7 && calificacion<8){
            resultado="C";
        }else if(calificacion>=8 && calificacion<9){
            resultado="B";
        }else if(calificacion>=9 && calificacion<=10){
            resultado="A";
        }else{
            System.out.println("Calificación fuera del rango");
            //Rompemos el programa para no mostrar el mensaje de la linea 26
            System.exit(0);
        }

        System.out.println("Le alumno obtuvo una calificación de: "+calificacion+" con un valor de: "+resultado);
    }
}
