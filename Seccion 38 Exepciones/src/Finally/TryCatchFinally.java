package Finally;

//Todo en esta clase vamos a ver el metodo finally en las exepciones
public class TryCatchFinally {

    public static void main(String[] args) {
        int resultado=0;
        try{
            //Todo Bloque para realizar el proceso
            resultado=10/0;
        //Todo Bloque para recoger el error de la execepcion
        }catch (Exception e){
            e.printStackTrace();
        }finally { //Todo el bloque finally siempre se ejecuta independientemente si existe o no un error
            System.out.println("Se realizo la operacion");
        }

        //Codigo final
        /*
        Cuando existe un bloque de Exepciones permite al programa continuar con la ejecucion
        mandando a consola el error o la execpcion que ocurra
         */
        System.out.println("El resultado es :"+resultado);
    }
}
