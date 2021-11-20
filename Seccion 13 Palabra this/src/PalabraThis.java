public class PalabraThis {
    String nombre;
    int edad;
    char sexo;
    //Metodo constructor
    public PalabraThis(String nom,int edad, char s){
        //La palabra this hace referencia a valores pertenecientes a la clase como la propiedad nombre
        this.nombre=nom;
        this.edad=edad;
        this.sexo=s;
    }
    //Metodo que retorna una cadena de texto
    public String toString(){
        return "El nombre es: "+this.nombre+" con una edad de: "+this.edad;
    }
    public static void main(String[] args) {
        PalabraThis p=new PalabraThis("Edgar",21,'M');
        System.out.println(p.toString());
    }
}
