public class numero {
    public static void main(String[] args) {
        int numero=2;
        try{
            if(numero==3){
                System.out.println("Numeros iguales");
            }else if(numero==2){
                //Creacion de una exeception
                throw  new Exception("Los numeros son iguales");
            }else{
                //Creacion de un mensaje de una nueba exception
                throw new Exception("Otro numero");
            }

            System.out.println("Adios");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
