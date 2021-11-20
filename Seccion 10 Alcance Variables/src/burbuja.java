import java.util.Arrays;

public class burbuja {
    public static void main(String[] args) {
        int [] arreglo={4,1,7,0};

        for(int i=0;i<arreglo.length;i++){
            for(int j=0;j<arreglo.length-1;j++){
                if(arreglo[i]<arreglo[j]){
                    int aux=arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
            }
        }

        System.out.println(Arrays.toString(arreglo));
    }
}
