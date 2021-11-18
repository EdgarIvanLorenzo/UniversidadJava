package break_continue;

public class Continue {
    public static void main(String[] args) {
        System.out.println("Numeros impares del 1 al 10");
        //La sentencia continue pasa a la siguienre iteracion
        for (int i=0;i<10;i++){
            //entramos a la sentencia de control cuando el numeros sea par
            if(i%2==0){
                //nos saltamosa  a la siguiente irteracion
                continue;
            }
            //Se imprimen los numeros impares
            System.out.println(i);
        }
    }
}
