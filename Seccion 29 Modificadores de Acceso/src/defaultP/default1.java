package defaultP;
//Modificador de acceso por default elimina el publico de la clase ya que permite encapsularlo en el mismo paquete
class default1 {
//Todo cuando quitamos el modificador de acceso de la clase pasa hacer parte del paquete actual
    //Todo eso quiere decir que solo se puede utilizar dentro del mismo paquete
    //Dato de tipo publico
    String nombre;

    public default1(String n){
        this.nombre=n;
    }
}
