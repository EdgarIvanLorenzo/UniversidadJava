package clases;

public class Gerente extends Empleado{
    TipoGerente gerente;

    //Metodo contructor de la clase
    public Gerente(){} //Constructor vacio
    public Gerente(String n,int e,TipoGerente g){
        super(n,e);
        this.gerente=g;
    }

    @Override
    public String toString(){
                                                //Obtenemos la descripcion del gerente eligido por ENum
        return "Gerente: "+super.toString()+ " "+this.gerente.getDescripcion();
    }

    public TipoGerente obtenerGerente(){
        return this.gerente;
    }
}
