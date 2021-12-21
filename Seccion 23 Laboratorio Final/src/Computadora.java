public class Computadora {
    static int idComputadora; //Creacion de una variable de tipo statica
    int id; //Creacion de una variable de tipo int para poder aguardar el valor de la variable estatica
    String nombre;
    Monitor monitor;
    Mouse mouse;
    Teclado teclado;
    //Metodo constructor
    public Computadora(String n,Monitor m,Teclado t,Mouse mouse){
        this.nombre=n;
        this.monitor=m;
        this.mouse=mouse;
        this.teclado=t;
        //Incremento de la variable statica
        Computadora.idComputadora++;
        //Asignacion de la variable local lo que tiene la variable estatica para agusrdar el id
        this.id=Computadora.idComputadora;
    }

    //Metodo toString para imprimir una cadena de las propiedades de la clase;
    public String toString(){
        return this.id+" con monitor --- "+this.monitor.getMarca()+" con mouse --- "+this.mouse.getModelo()+" y teclado --- "+this.teclado.getModelo();
    }
}
