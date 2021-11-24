import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    //Metodo para ejecutar la construccion de los datos
    public static void main(String[] args) {
        //Creacion de un objeto Empleado
        Empleado juan=new Empleado("Juan","Ciudad Mx",30,'M',2000);

        //Se le conoce como polimorfismo
        System.out.println(juan.toString()); //Se llama el metodo toString de la clase Hija

        //Creacion de un segundo empleado
        Empleado Edgar=new Empleado("Edgar","Ciudad Mx",20,'M',10000);
        System.out.println(Edgar.toString());


        //Todo creacion de objeto de tipo Cliente
        Date fechaActual=new Date(); //Se crea un objeto de tipo Date
        //Para consultar formatos dirijirse a la web https://www.tutorialspoint.com/java/java_date_time.htm
        SimpleDateFormat formato=new SimpleDateFormat("yyyy-MM-dd"); //Se crea un formato

                                                                                    //Se e da el formato que pasa a ser String
        Cliente kevin=new Cliente("Kevin","Mexico",20,'M',formato.format(fechaActual),true);
        System.out.println(kevin.toString());
    }
}
