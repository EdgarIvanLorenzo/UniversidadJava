public class Encapsulamiento {
    //Modificador de acceso
    private int numero1;
    private int numero2;

    public Encapsulamiento(){

    }

    //todo metodo set para cambio de valor
    protected void setNumero1(int numero){
        this.numero1=numero;
    }
    protected void setNumero2(int numero){
        this.numero2=numero;
    }

    //Todo metodo get para extrater datos
    protected int getNumero1(){
        return this.numero1;
    }
    protected int getNumero2(){
        return this.numero2;
    }

    public String toString(){
        return "El numero 1="+this.numero1+" El numero2="+this.numero2;
    }

    //Metodo main
    public static void main(String[] args) {
        Encapsulamiento uno=new Encapsulamiento();
        //Como estamos dentro de la misma clase si podemos modificar
        uno.setNumero1(2);
        System.out.println(uno.getNumero1());
        System.out.println(uno.numero1);
    }
}
