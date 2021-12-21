public class Main {
    public static void main(String[] args) {
        //Construccion de un teclado
        Teclado teclado=new Teclado("Quia",1);
        //Construccion de un mouse
        Mouse mouse=new Mouse("Besta",1);
        //Contruccion de un monitor
        Monitor pantalla1=new Monitor("Samsung",24,1);
        Monitor pantalla2=new Monitor("LG",24,1);

        //Costruccion de una computadora
        Computadora compu1=new Computadora("Personalizado",pantalla1,teclado,mouse);
        Computadora compu2=new Computadora("Personalizado2",pantalla2,teclado,mouse);

        //Creacion de la orden de dos computadoras
        Orden orden1=new Orden(2);
        orden1.agregar(compu1);
        orden1.agregar(compu2);
        //Imprecionde la lista de computadoras
        System.out.println("Orden = "+Orden.idOrden);
        orden1.Lista();

    }
}
