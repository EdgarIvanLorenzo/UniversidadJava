package clases;

public class Empleado {
    String nombre;
    int edad;

    public Empleado(){}
    public Empleado(String n,int e){
        this.nombre=n;
        this.edad=e;
    }

    @Override
    public String toString(){
        return this.nombre+"  "+this.edad;
    }

    public String Comprobar(Empleado e){
        if(e.nombre.equals(this.nombre) && e.edad==this.edad){
            return "Iguales";
        }else{
            return "Distintos";
        }
    }
}
