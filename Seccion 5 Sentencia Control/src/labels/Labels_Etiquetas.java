package labels;

public class Labels_Etiquetas {
    public static void main(String[] args) {
        System.out.println("Numero Par");

        //Etiqueta Label
        inicio:
        //ciclo
        for(int i=0;i<10;i++){
           if(i%2==0){
               //Se imprime el numero par
               System.out.println(i);
               //Nos redirijimos al ciclo
               continue inicio;
           }
        }
    }
}
