package Estaticos;

public class test {
    public static void main(String[] args) {
        //Primera instancia
        BloqueEstatico n=new BloqueEstatico();
        System.out.println(n.getIdPersona());

        //Segunda instancia
        BloqueEstatico n2=new BloqueEstatico();
        System.out.println(n2.getIdPersona());

        //Tercera instancia
        BloqueEstatico n3=new BloqueEstatico();
        System.out.println(n3.getIdPersona());
    }
}
