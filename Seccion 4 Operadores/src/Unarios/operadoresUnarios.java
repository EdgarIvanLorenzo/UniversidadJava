package Unarios;

public class operadoresUnarios {
    public static void main(String[] args) {
            //Los operadores unarios son los de diferente d, los preincrementos o los postincremento
        //Operador distinto de
        int numero=5;
        int b=-numero;
        System.out.println("Valor de numero: "+numero);
        System.out.println("Valor de b es: "+b);
        System.out.println("**************");
        boolean verdad=true;
        boolean contrario=!verdad; //Lo contrario de verdad en un dato booleano
        System.out.println("Valor de verdad: "+verdad);
        System.out.println("Valor del contrario: "+contrario);
        System.out.println("**************");

        //Valores preincrementos
        System.out.println("Los valores de preincrementos son los que van antes de las variables");
        int a=5; //Valor de a es 5
        //Constante
        final int c=++a; //primero se incrementa a uno y luego se asigna a la variable c
        System.out.println("Valor de a: "+a);
        System.out.println("Valor de c: "+c);
        System.out.println("**************");

        //Valores postIncremento
        System.out.println("Los valores de postincremento es incrementar despues de la variable");
        System.out.println("Valor de a: "+a);
        final int e=a++; //Primero se asigna el valor a la variable y ese valor ya se asigna a la variable e
        //La viariable de e=6 y la variable de a=7
        System.out.println("Valor de a++ "+a);
        System.out.println("Valor de e: "+e);
    }
}
