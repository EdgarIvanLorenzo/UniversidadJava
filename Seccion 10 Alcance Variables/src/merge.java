import java.util.Arrays;

public class merge {
    public merge(){

    }

    public int[] Merge(int[] arreglo1,int[] arreglo2){
        int index=arreglo1.length-1;
        int[] arreglo = new int[arreglo1.length+arreglo2.length];
        int indice1=0,indice2=0,indice3=0;
        while(indice1<=index && indice2<=index){
            if(arreglo1[indice1]<arreglo2[indice2]){
                arreglo[indice3]=arreglo1[indice1];
                indice1+=1;
            }else{
                arreglo[indice3]=arreglo2[indice2];
                indice2+=1;
            }
            indice3+=1;
        }

        for(int j=indice1;j<arreglo1.length;j++){
            arreglo[indice3]=arreglo1[j];
            indice3+=1;
        }
        for(int o=indice2;o<arreglo2.length;o++){
            arreglo[indice3]=arreglo2[o];
            indice3+=1;
        }
        return arreglo;

    }
    public static void main(String[] args) {
        int[] arreglo1={1,4,6,10};
        int[] arreglo2={0,2,9,10};

        merge ordenamiento=new merge();
        System.out.println("Resultado: "+ Arrays.toString(ordenamiento.Merge(arreglo1,arreglo2)));
    }
}
