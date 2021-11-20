public class Persona {
    String nombre;
    int edad;
    public Persona(String nombre,int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
    public void Imprimir(){
        //Se imprime la referencia al objeto de la clase
        System.out.println(this);
    }
}
