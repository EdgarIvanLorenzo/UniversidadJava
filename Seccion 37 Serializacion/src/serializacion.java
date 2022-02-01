//Todo Las clases de tipo serialiable son aquellas que nos permiten compartir informacion
//todo entre servidores y mandarlos en forma de bytes
//Todo serializacion=Convercion a bytes
//Todo deseralizacionn= Conversion a objeto

import java.io.Serializable;

//Clase para crear una serializacion de una persona
public class serializacion implements Serializable { //Debe de implementar un serializable
    //Los atributos deben de ser privados
    private String nombre, apellidos;

    //Debe de contener un constructor vacio
    public serializacion(){}

    //opcional puede ontener un constructor o mas con parametros
    public serializacion(String n,String a){
        this.nombre=n;
        this.apellidos=a;
    }


    //DEbe de contener los metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "serializacion{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
