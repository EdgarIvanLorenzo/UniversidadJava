package Persona;

public class persona {
    String nombre;
    int edad;
    public persona(String p,int e){
        this.nombre=p;
        this.edad=e;
    }
    //Metodo toString el cual retorna una cadena
    public String toString(){
        return "Nombre---- "+this.nombre+" Edad----- "+this.edad;
    }
}
