import java.util.Hashtable;

public class numeroVecesPalabra {
    public static void main(String[] args) {
        String cadena="Hola Kevin Francisco Lorenzo como estas soy Edgar Ivan Lorenzo como";
        //creacion del objeto hashTable con dos propiedades key y value cada uno con su respectivo tipo de dato
        //         key.String,value:Integer
        Hashtable<String, Integer> tabla=new Hashtable<String, Integer>();
        //convierto la cadena a un arreglo de string
        String [] arregloCadena=cadena.split(" ");
        //Recurremos el arreglo de palabras con un forEach
        for(String palabra: arregloCadena){
            //Si la propiedad no existe dentro del hashtable
            if(!tabla.containsKey(palabra)){
                //Agregamos la propiedad con su valor
                tabla.put(palabra,1);
            }else{ //Caso contradio si la propiedad ya existe
                //Creamos una variable para asignarle el valor de la propiedad que ya existe
                int valor=tabla.get(palabra);
                //Lo incrementamos a 1
                valor+=1;
                //Reemplazamos el valor con el metodo replace con la propiedad
                //Si nosotros usamos el metodo put del objeto hashtable creamos una nueva propiedad
                tabla.replace(palabra,valor);
            }
        }
        //Por ultimo se imprime el hashtable llamado tabla esto es igual a una dato de tipo jason o un
        //diccionario en python u json en javascript u objetos
        System.out.println(tabla);
    }
}
