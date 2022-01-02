public class suma extends operaciones{ //Implementacion de una clase
    //Propiedades de la clase
    int numero1;
    int numero2;

    //Metodo constructor de la clase suma
    public suma(int n1, int n2){
        this.numero1=n1;
        this.numero2=n2;
    }

    @Override //Sobreescritura del metodo de la clase padre de tipo Abstract
    public int operacion(){
        return this.numero1+numero2; //Retorno de la suma
    }
}
