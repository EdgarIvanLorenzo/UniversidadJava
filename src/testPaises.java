public class testPaises {
    public static void main(String[] args) {
        System.out.println(paises.Mexico.getNombre());
        paises.Mexico.setNombre("EdoMX"); //Cambio del valor a la referencia del pais Mexico y la propiedad nombre
        System.out.println(paises.Mexico.getNombre()); //Imprimir cambio del valor
    }
}
