public class ParametrosRest {
    public static void main(String[] args) {
        frutas("Naranja","Uva","Manzana");
        frutas("Naranja","Uva","Manzana","Fresa","Coco");
    }

    //Metodo estatico
    public static void frutas(String fruta1,String... frutas){ //Los datos de tipo rest se almacenan como un arreglo
        System.out.println("Fruta 1: "+fruta1);

        //Recorrido de las frutas del parametro rest o resto
        for(String f:frutas){
            System.out.println(f);
        }
    }
}
