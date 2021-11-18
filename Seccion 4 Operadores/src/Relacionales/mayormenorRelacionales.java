package Relacionales;

public class mayormenorRelacionales {
    public mayormenorRelacionales(){}
    public String true_false(boolean dato){
        if(dato==true){
            return "Verdadero";
        }else{
            return "Falso";
        }
    }
    public static void main(String[] args) {
        mayormenorRelacionales objeto=new mayormenorRelacionales();
        int numero1=9;
        int numero2=4;

        //comparamos si los numeros son iguales;
        boolean comparacion;
        comparacion=numero1==numero2;
        System.out.println("Los numeros son iguales: "+objeto.true_false(comparacion));

        //Comparamos si el numero 1 es mayor al numero2
        comparacion=numero1>numero2;
        System.out.println("Numero 1 es mayor a numero 2: "+objeto.true_false(comparacion));
    }
}
