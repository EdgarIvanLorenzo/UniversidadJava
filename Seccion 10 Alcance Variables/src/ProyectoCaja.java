import java.util.Scanner;

public class ProyectoCaja {
    float alto,ancho,largo;
    public ProyectoCaja(float alto,float largo,float ancho){
        this.alto=alto;
        this.ancho=ancho;
        this.largo=largo;
    }
    public float Resultado(){
        return this.largo*this.alto*this.ancho;
    }

    public static void main(String[] args) {
        float alto,ancho,largo;
        Scanner teclado=new Scanner(System.in);
        System.out.print("Ingrese el alto de la caja: ");
        alto=teclado.nextFloat();
        System.out.print("\nIngrese el ancho de la caja: ");
        ancho=teclado.nextFloat();
        System.out.print("\nIngrese el largo de la caja: ");
        largo=teclado.nextFloat();
        ProyectoCaja caja1=new ProyectoCaja(alto,largo,ancho);
        System.out.println("El resultado es: "+caja1.Resultado());
    }
}
