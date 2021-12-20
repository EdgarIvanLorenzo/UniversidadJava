public class Constructor {
    String dato;
    //Sobre carga de constructores
    public Constructor(){}
    public Constructor(String dato){
        this.dato=dato;
    }

    public static void main(String[] args) {
        //Sin datos
        Constructor c= new Constructor();
        System.out.println(c.dato);

        //con dato
        Constructor c2=new Constructor("Hola");
        System.out.println(c2.dato);
    }
}
