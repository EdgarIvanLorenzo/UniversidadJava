package Constructor;

public class sobreCargaConstructores {
    int numero1,numero2;

    //constructor vacio
    public sobreCargaConstructores(){
        System.out.println("Ejecutando el constructor vacio");
    }

    //contructor con parametros
    public sobreCargaConstructores(int numero1,int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }

    //Metodo para hacer la suma el cual retorna un valor entero
    public int suma(){
        return this.numero1+this.numero2;
    }

    public static void main(String[] args) {
        var uno="Hola Mundo";
        sobreCargaConstructores suma1=new sobreCargaConstructores();
        System.out.println("Sin parametros");
        System.out.println(suma1.suma());
        sobreCargaConstructores suma2=new sobreCargaConstructores(3,5);
        System.out.println("Con parametros");
        System.out.println(suma2.suma());
        System.out.println(uno);
    }
}
