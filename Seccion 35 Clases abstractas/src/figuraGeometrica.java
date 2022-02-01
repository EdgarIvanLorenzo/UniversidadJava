public abstract class figuraGeometrica { //Todo clase abstracta cuando existe un metodo abstracto
    protected String tipoFigura;

    //Metodo constructor
    public figuraGeometrica(String figura){
        this.tipoFigura=figura;
    }

    //Metodo abstracto que se implementa en clases que heredan de ellas
    public abstract void dibujar(); //cuando exite un metodo abstracto la clase se vuelve abstracta

    @Override
    public String toString(){
        return "La figura es : "+this.tipoFigura;
    }
}
