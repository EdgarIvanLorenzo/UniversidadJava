package protegido;
//Modificadores de acceso protegido
public class Persona {
    protected String nombre;
    protected int edad;

    //Metodo constructor con modificador de acceso publico
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    //Metodo toString
    public String toString(){
        return this.nombre+" tiene "+this.edad+" años";
    }

}
