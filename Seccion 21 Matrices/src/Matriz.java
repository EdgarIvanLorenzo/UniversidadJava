public class Matriz {
    public static void main(String[] args) {
        int[][] matriz ={
                {9,10}, {1,2}
        };

        //Recorrido de las matrices
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
