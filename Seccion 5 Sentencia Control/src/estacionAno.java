import java.util.Scanner;

public class estacionAno {
    public static void main(String[] args) {
        //Las sentencias de control if-else if-else
        String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre",
        "Noviembre","Diciembre"};
        int mes=0;
        System.out.println("Ingrese el numero del mes: ");
        Scanner entrada=new Scanner(System.in);
        mes= entrada.nextInt();
        if(mes>0 && mes <=3){
            System.out.println(meses[mes-1]+" es de la estacion de Primavera");
        }else if(mes>3 && mes<=6){
            System.out.println(meses[mes-1]+" es de la estacion de Verano");
        }else if(mes>6 && mes<=9){
            System.out.println(meses[mes-1]+" es de la estacion de Otoño");
        }else if(mes>9 && mes<=12){
            System.out.println(meses[mes-1]+" es de la estacion de Invierno");
        }else{
            System.out.println("El mes no existe");
        }
    }
}
