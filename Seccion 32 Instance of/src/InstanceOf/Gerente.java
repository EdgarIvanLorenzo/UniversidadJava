package InstanceOf;

//Todo clase hija de la clase padre Empleado
public class Gerente extends Empleado{
    String tipo;
    static int idGerente;
    public Gerente(String n,int e,String t){
        super(n,e);
        this.tipo=t;
        Gerente.idGerente++;
    }

    //Sobreescritura del metodo ToString o polimorfismo
    @Override
    public String toString(){
        return "Gerente # "+Gerente.idGerente+" "+super.toString();
    }

}
