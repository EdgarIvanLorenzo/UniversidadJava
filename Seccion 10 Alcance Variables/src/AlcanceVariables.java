public class AlcanceVariables {
    //Variable global
    int numero1=10;
    public AlcanceVariables(){

    }
    public int numero(){
        //Variable de tipo local
        int numero1=9;
        //Retornamos la variable local con valor 9
        return numero1;
    }

    public static void main(String[] args) {
        AlcanceVariables uno=new AlcanceVariables();
        //Imprime el valor de la variable global
        System.out.println(uno.numero1);
        //imprime el valor de la variable local por parte del metodo
        System.out.println(uno.numero());
        System.gc();
    }
}
