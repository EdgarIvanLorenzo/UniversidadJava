public enum paises {
    Rusia("Rusia",3000,"Frio"),
    Mexico("CDMX",3000,"Templado");

    //Se declaran las propiedades
    private String nombre;
    private String clima;
    private int cantidad;

    //Metodo set ahislado
    public void setNombre(String nombre){
        this.nombre=nombre;
    }


    //metodo get para extraer la propiedade de algun tipo pais
    public String getNombre() {
        return nombre;
    }

    public String getClima() {
        return clima;
    }

    public int getCantidad() {
        return cantidad;
    }

    paises(String nombre,int antidad,String clima){
        this.nombre=nombre;
        this.clima=clima;
        this.cantidad=antidad;
    }

    //Retorno de los datos


}
