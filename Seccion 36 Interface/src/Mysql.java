public class Mysql implements conexionMysql{ //Las interface se implementan
    private int id=0;
    @Override
    public void insertar() {
        //Acceso a datos o constantes de la interface
        if(this.id<conexionMysql.Maximo){
            System.out.println("Metodo de insercion");
            id++;
        }else{
            System.out.println("Maximo de insercion **** ERROR ****");
        }

    }

    @Override
    public void eliminar() {
        if(this.id>0){
            System.out.println("Metodo para eliminar");
            this.id--;
        }else{
            System.out.println("***** No hay nada que eliminar *****");
        }

    }

    @Override
    public void seleccionar() {
        System.out.println("Metodo para selecionar");
    }

    @Override
    public void actualizar() {
        System.out.println("Metodo para actualizar registros");
    }

}
