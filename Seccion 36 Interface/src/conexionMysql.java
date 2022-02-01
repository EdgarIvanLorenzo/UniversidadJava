//Una interface solo me permite definir una estructura y la ventaja es que esta es implementada
//Las interface son implementadas no estendidas
public interface conexionMysql {

    //todo una interface permite definir la estructura y es implementada

    //Las propiedades de una interface se tratan como constantes que se pueden usar como una propiedad
    int Maximo=5;

    //Metodos abstractos en la interface
    void insertar();
    void eliminar();
    void seleccionar();
    void actualizar();
    //implementacion de la estructura
}
