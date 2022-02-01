package clases;

public enum TipoGerente {
    General("Gerente encargado de todas las areas"),
    Departamental("Gerente encargado de un departamento");

    private String descripcion;

    //Construcion de un metodo constructor
    private TipoGerente(String d){
        this.descripcion=d;
    }

    public void setDescripcion(String d){
        this.descripcion=d;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

}
