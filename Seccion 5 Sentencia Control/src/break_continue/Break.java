package break_continue;

public class Break {
    public static void main(String[] args) {
        //La sentencia break se utiliza para romper el ciclo
        for(int i=0;i<10;i++){
            if(i%2==0){
                System.out.println(i); //Se imprime el primer numero par
                //Rompemos el ciclo y nos dirijimos a la linea 13
                break;
            }
        }
    }
}
