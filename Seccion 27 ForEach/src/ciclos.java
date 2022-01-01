//Una interface en java solo se pueden usar en las clases no en variables ni en constantes
public class ciclos {
    public static void main(String[] args) {
        //Instancias
        personas persona1=new personas("Edgar",20);
        personas persona2=new personas("Kevin",50);
        personas persona3=new personas("Jose",30);

        //Creacion de arreglo
        personas[] arregloPersonas=new personas[3];
        //Inicializacion de los espacios de memoria por parte de las posiciones
        arregloPersonas[0]=persona1;
        arregloPersonas[1]=persona2;
        arregloPersonas[2]=persona3;


        //Recorrido de arreglo con el ciclo forEach
        for(personas persona:arregloPersonas){
            System.out.println(persona); //Mandamos a llamar al metodo toStirng de la clase a la cual se realiza la instancia
        }
    }
}
