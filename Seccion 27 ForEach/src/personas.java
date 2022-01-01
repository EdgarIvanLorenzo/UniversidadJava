public class personas {
    String nombre;
    int edad;
    public personas(String n, int e){
        this.nombre=n;
        this.edad=e;
    }

    public String toString(){
        return "La persona "+this.nombre+" tiene "+this.edad+" años";
    }
}
