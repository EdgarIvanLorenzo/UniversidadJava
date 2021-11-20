public class Persona {
    protected String nom,ape;
    protected int edad;
    static protected int id=0;
    public Persona(String n,String a,int e){
        this.nom=n;
        this.edad=e;
        this.ape=a;
        //Accedemos a una propoedad estatica asiendo referencia a la clase ala cual pertence
        Persona.id+=1;
    }
    //Metodo toString
    public String toString(){
        return Persona.id+" -- La persona "+this.nom+" "+this.ape+" con "+this.edad+" años";
    }

    //Metodo estatico
    public static void Saludo(){
        System.out.println("Hola desde la clase Persona");
    }
}
