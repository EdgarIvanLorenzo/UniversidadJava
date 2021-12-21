public class parametrosRest {
    public static void main(String[] args) {
        parametrosRest.Frutas("Platano","Fresa","Naranja","Coco","Uva");
    }

    //Incluir dos datos String que almacenan un valor el ultimo almaena todos los demas datos como un arreglo de n elementos
    //Todo se les conoce como parametros rest en lenguajes como javascript
    public static void Frutas(String fruta1,String fruta2,String... frutas){
        System.out.println("Fruta 1: "+fruta1);
        System.out.println("Fruta 2: "+fruta2);

        System.out.println("Se imprimen los parametros restantes como un arreglo");
        //Impresion de las futas restantas
        for(String f:frutas){
            System.out.println(f);
        }
    }
}
