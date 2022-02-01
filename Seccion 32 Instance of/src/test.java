//Todo importacion de los datos del paquete
import InstanceOf.Empleado;
import InstanceOf.Gerente;



public class test {
    public static void main(String[] args) {
        Empleado empleado1=new Empleado("Edgar Ivan",30);
        System.out.println(empleado1);

        test.TipoInstancia(empleado1);
    }

    //Metodo statico para saber el o los tipos de instancias
    //Todo una clase Gerente es instancia de Gerente y de Empledo ya que Gerente hereda de Empleado
    //Una clase Empleado solo es instancia de Empleado
    //Todo se hereda de la clae Object

    public static void TipoInstancia(Empleado empleado){
        //Siempre que vamos a verificar debemos comenzer por las instancia hijas y poesteriormete a las padres
        if(empleado instanceof Gerente){//Todo instancia hija
            System.out.println("Es instancia de Gerente");
        }else if(empleado instanceof Empleado){//Todo instancia padre
            System.out.println("Es instancia de Empleado");
            //Una instancia de tipo Oject son todas ya que todas las instancia son object
        }else if (empleado instanceof Object){ //Todo instancia abuela de todas las anteriores
            System.out.println("Es instancia de tipo Object");
        }
    }
}
