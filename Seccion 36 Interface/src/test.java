public class test {
    public static void main(String[] args) {
        //Creacion de un objeto de mysql
        Mysql conexion1=new Mysql();

        Oracle conexion2=new Oracle();
    }

    //Metodo statico
    //El dato que recibimos por parametro es de un tipo conexionMysql de interface
    public static void Ejecutar(conexionMysql conexion){
        conexion.insertar();
        /*Se puede ejecutar el metodo insertar dependiendo dela clase y como la interface
        declara el metoo puede ser ejecutado
         */
    }
}
