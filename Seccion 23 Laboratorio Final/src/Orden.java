public class Orden {
    int contador,maximo;
    static int idOrden;
    Computadora[] computadoras;
    //Metodo constructor para la construccion de las computadoras
    public Orden(int maximo){
        this.computadoras=new Computadora[maximo];
        this.maximo=maximo;
        this.contador=0;
        Orden.idOrden++;
    }

    public void agregar(Computadora c){
        if(this.contador<this.maximo){
            this.computadoras[contador]=c;
            this.contador++;
        }
    }

    public void Lista(){
        //Recorremos el arrglo de computadoras de la orden o de la compra
        for(Computadora c:this.computadoras){
            System.out.println(c.toString());
        }
    }

}
