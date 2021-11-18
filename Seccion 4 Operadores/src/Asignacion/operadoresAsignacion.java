package Asignacion;

public class operadoresAsignacion {
    public static void main(String[] args) {
        //Operador de asignaion
        int numero=10;
        //incremento de la variable numero mas 3
        numero+=3;
        System.out.println(numero);
        //Modulo de la variable numero a 2 y esl reeultado se lo asignamos a la misma variable numero
        numero%=2;
        System.out.println(numero);
        //Operador de multillicacion con asignacion
        numero*=5; // numero=numero*5
        System.out.println(numero);
        //Operador de asignacion con resta = numero=numero-1
        numero-=1;
        System.out.println(numero);
    }
}
