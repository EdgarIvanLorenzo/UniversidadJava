import java.util.Objects;

public class persona {
    String nombre;
    int edad;
    public persona(String n, int e){
        this.nombre=n;
        this.edad=e;
    }

    //Creacion del metodo toString
    @Override
    public String toString(){
        return this.nombre+"----"+this.edad;
    }

    //todo implementacion de los metodos equals y hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        persona persona = (persona) o;
        return edad == persona.edad && nombre.equals(persona.nombre);
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad);
    }
}
