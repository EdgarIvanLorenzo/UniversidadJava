public class PasoPorReferencia {
    String nombre;
    public PasoPorReferencia(){
        this.nombre="";
    }
    public static void main(String[] args) {
        //Se crea la instancia a una clase e un espacio en memoria  o referencia a memoria
        PasoPorReferencia p = new PasoPorReferencia();
        p.nombre="Edgar";
        System.out.println(p.nombre);
        Cambiar(p,"Kevin");
        System.out.println(p.nombre);
    }

    public static void Cambiar(PasoPorReferencia p,String nombre){
        //Se cambia el valor a la referencia de memoria a diferencia de valores primitivos
        p.nombre=nombre;
    }
}
