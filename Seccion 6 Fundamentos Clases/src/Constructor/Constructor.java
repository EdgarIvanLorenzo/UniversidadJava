package Constructor;

public class Constructor {
    int numero1,numero2;

    //Constructor vacio
    public Constructor(){

    }
    public int suma(int numero1,int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        return this.numero1+this.numero2;
    }
    public static void main(String[] args) {
        Constructor suma1=new Constructor();
        System.out.println("El resultado de la suma es: "+suma1.suma(2,3));
    }
}
