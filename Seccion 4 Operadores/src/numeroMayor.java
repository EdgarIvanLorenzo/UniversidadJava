public class numeroMayor {
    public static void main(String[] args) {
        int [] numeros= {1,2,5,0,10,-1,20};
        int primero=numeros[0];
        for(int numero:numeros){
            if(numero>primero){
                primero=numero;
            }
        }
        System.out.println("El numero mayor del arreglo es: "+primero);
    }
}
