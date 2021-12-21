//Improtamos las clases de caa uno de los paquetes
import Producto.producto;
import Orden.orden;
public class venta {
    public static void main(String[] args) {
        //creacion de los productos
        producto celular=new producto(1,"Samsung",3000.00);
        producto papel=new producto(100,"Papel",30.00);

        //Creacion del objeto de la venta
        orden orden1=new orden(3);
        //Agregamos datos al arreglo de productos de la clase orden
        orden1.agregar(celular);
        orden1.agregar(papel);
        //Calculamos precio e imprimimos es resultado
        System.out.println(orden.idOrden);
        System.out.println("------------------------");
        orden1.productosM();
        System.out.println("------------------------");
        System.out.println("El precio total de la venta es de: "+orden1.calcularCosto());
    }
}
