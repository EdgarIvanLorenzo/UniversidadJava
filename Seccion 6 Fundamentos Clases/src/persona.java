public class persona {
    private String nombre,apellido;

    //Metodo get retorna un valor
    public String getNombre() {
        return nombre;
    }

    //El metodo set es vacio por que no retorna ningun valor es vacio pero resive un dato
    public void setNombre(String nombre) {
        //Cambiamos el dato por el dato del parametro que recibe el metodo set
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void informacion(){
        System.out.println("Nombre: "+this.nombre+" Apellidos: "+this.apellido);
    }
}
