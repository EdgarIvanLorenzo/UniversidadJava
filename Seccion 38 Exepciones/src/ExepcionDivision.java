public class ExepcionDivision {
    public static void main(String[] args) {
        //todo Una exeption me permite mandar el error a consula y contonuar con la ejecucion del programa
        int resultado=0;
        try{
            resultado=10/0;
        }catch (Exception e){
            //Si ocurre algun error este se manda a la consola y se continua con la ejecucion del programa
            e.printStackTrace();
        }

        System.out.println("Continuacion con la ejecucion del programa");
        System.out.println("El resultado es: "+resultado);
    }
}
