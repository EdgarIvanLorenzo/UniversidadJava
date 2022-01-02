package privado;

public class Electronicos {
    protected String nombre;
    protected float costo;
    private String marca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Electronicos(String n, float c, String marca){
        this.nombre=n;
        this.costo=c;
        this.marca=marca;
    }

    //Todo metodo de tipo privaoo
    private void Mensaje(){
        System.out.println("ESto es un electronico");
    }

    public void mensajePublic(){
        this.Mensaje(); //Ejecucion del metodo privado de la clase
    }

    @Override
    public String toString(){
        return "El electonico "+this.nombre+" tiene un costo de "+this.costo+" de la marca "+this.marca;
    }
}
