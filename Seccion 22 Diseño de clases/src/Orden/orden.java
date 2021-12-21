package Orden;
import Producto.producto;

import java.util.Arrays;

public class orden {
    int contador=0;
    public static int idOrden;
    int maximo;
    public producto[] productos;

    public orden(int maximo){
        this.maximo=maximo;
        this.productos=new producto[maximo];
        orden.idOrden++;
    }

    public void agregar(producto pro){
        this.productos[contador]=pro;
        contador+=1;
    }
    //Metodo calcular costoFinal el cual retorna un dato de tipo double
    public double calcularCosto(){
        int costoFinal=0;
        for(int i=0;i<this.productos.length;i++){
            if(this.productos[i]!=null){
                costoFinal+=this.productos[i].precio;
            }
        }//Retorno del valor de la suma de los articulos
        return costoFinal;
    }

    //Metodo para imprimir los articulos
    public void productosM(){
        for(int i=0;i<this.productos.length;i++){
            if(this.productos[i]!=null){
                //Imprecion de los articulos
                System.out.println(this.productos[i].nombre+"\t\t$"+this.productos[i].precio);
            }
        }
    }
}
