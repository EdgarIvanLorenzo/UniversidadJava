package InstanceOf;

//Clase padre
public class Empleado {
    String nombre;
    int edad;
    static int id;
    public Empleado(String n,int e){
        this.nombre=n;
        this.edad=e;
        Empleado.id+=1;
    }

    //Metodo toString
    public String toString(){
        return Empleado.id+" Nombre: "+this.nombre;
    }
}
