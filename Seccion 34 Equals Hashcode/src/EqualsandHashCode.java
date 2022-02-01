public class EqualsandHashCode {

    /*
    Algo muy impoprtante a tener en cuenta es que la referencia de meoria es diferente a los datos de las propiedades de las
    clase de objeto creado la referencia de memoria es una cosa y las propiedades otra
     */
    public static void main(String[] args) {
        //Creacion de la primera referencia
        persona persona1=new persona("Edgar",21);
        //creacion de la segunda referencia
        persona persona2=new persona("Edgar",21);

        //Verificar si lod datos de las referencias son iguales con el metodo equals
        if(persona1.equals(persona2)){
            System.out.println("Los objetos son iguales por el metodo equals");
        }else{
            System.out.println("Los objetos son diferentes por el metodo equals");
        }

        //Verificar si lod datos de las referencias son iguales con el metodo hashcode
        if(persona1.hashCode()==persona2.hashCode()){
            System.out.println("Los objetos son iguales por el metodo hashcode");
        }else{
            System.out.println("Los objetos son diferentes por el metodo hashcode");
        }
    }
}
