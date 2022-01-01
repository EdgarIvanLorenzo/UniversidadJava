package paises;

/* todo la ventaja de los enumeradores es que nos permite almacenar datos dentro de las porpiedades*/


public enum paises {
    //la enumeracion Africa contiene una propiedad llamada pais de tipo entero y un string capital
    Africa(20,"Congo"),
    America(10,"Argentina");

    //Variables privadas de las propiedades de los enumerados ordenados de la forma que estan detro de los parentesis
    private final int pais;
    private final String capital;

    /*todo Metodo constructor de los enumeradores va sin la palabra public ya que no se contruye un objeto
    * todo se contruye de forma interna */
    paises(int p,String capital){
        //inicializacion de los datos de las propiedades de los enumeradores
        this.pais=p;
        this.capital=capital;
    }


    //Metodos get para recuperar los valores de las enumeraciones dependiendo de la que se haya elejido
    public int getPaises(){
        return this.pais;
    }
    //Metodos get para recuperar la capital respectiva del enumerador seleccionado
    public String getCapital(){
        return this.capital;
    }
}
