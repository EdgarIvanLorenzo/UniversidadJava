package protegido;

public class Empleado extends Persona{
    public static int id=0;
    public Empleado(String n,int edad){
        super(n,edad);
        Empleado.id+=1;
    }

    //Sobreescritura del metodo toString
    @Override
    public String toString(){
        return Empleado.id+"--- "+super.nombre+"---- con "+super.edad;
    }
}
