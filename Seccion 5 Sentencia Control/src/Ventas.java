import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ventas {
    String nombre;
    double precio;
    public Ventas(String nombre,double precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public static void main(String[] args) {
        ArrayList<Ventas> arreglo=new ArrayList<Ventas>();
        Scanner entrada=new Scanner(System.in);
        int opcion=0;
        String productoNombre;
        double productoPrecio;
        int indiceEliminar;
        do{
            System.out.println("1-Agregar \n2-Ver \n3-Eliminar \n4-Salir");
            opcion=entrada.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    productoNombre=entrada.next();
                    System.out.println("Ingrese el precio del producto: ");
                    productoPrecio=entrada.nextDouble();
                    Ventas venta=new Ventas(productoNombre,productoPrecio);
                    arreglo.add(venta);
                    break;
                case 2:
                    for(Ventas e:arreglo){
                        System.out.println(e.nombre+"--- $"+e.precio);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el indice a eliminar: ");
                    indiceEliminar=entrada.nextInt();
                    arreglo.remove(indiceEliminar);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Gracias");
                    break;
                default:
                    //Libreria JoptionPane de java
                    System.out.println("Error");
                    break;
            }
        }while(opcion!=4);
    }
}
