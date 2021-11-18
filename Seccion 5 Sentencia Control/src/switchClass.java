public class switchClass {
    public static void main(String[] args) {
        //La sentencia switch se usa para comparar datos de tipos numericos o String
        //Es muy parecido a la sentencia if-else
        String [] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre",
                "Noviembre","Diciembre"};
        int mes=1;
        String mensaje="";

        //Dentro de la sentencia switch ponemos el valor a evaluar en esta caso es la variable mes
        switch (mes){
            //Para los casos podemos ingressar mas de uno en la misma sentencia como se muestra
            case 1: case 2: case 3:
                mensaje="Primavera";
                //Sentencia break para romper la sentencia y no seguir evaluando las otras sentencia
                break;
            case 4: case 5: case 6:
                mensaje="Verano";
                break;
            case 7: case 8: case 9:
                mensaje="Otoño";
                break;
            case 10: case 11: case 12:
                mensaje="Invierno";
                break;
            //Ultima sentencia cuando ninguna de la anteriores se cumple
            default:
                mensaje="Mes erroneo";
        }

        //Imptimimos la estacion del año respecto al mes
        System.out.println(mensaje);
    }
}
