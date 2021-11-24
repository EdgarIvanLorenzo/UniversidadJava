public class Persona {
    private String nombre;
    private String direccion;
    private int edad;
    private char genero;

    //Metodo constructor
    public Persona(String nombre,String direccion,int edad,char genero){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
        this.genero=genero;
    }

    //todo creacion de metodos get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //Metodo toString para imprimir datos
    public String toString(){
        return this.getNombre()+" "+this.getDireccion()+" "+this.getEdad()+" "+this.getGenero();
    }
}
