public class MetodosSobreCarga {
    public MetodosSobreCarga(){
    }

    //Sobrecarga de un metodo sumar
    public int sumar(int numero1,int numero2){
        return numero1+numero2;
    }
    public float sumar(float numero1,float numero2){
        return numero1+numero2;
    }

    public static void main(String[] args) {
        MetodosSobreCarga operacion1=new MetodosSobreCarga();
        System.out.println(operacion1.sumar(2,3)); //Datos de tip int

        MetodosSobreCarga operacion2=new MetodosSobreCarga();
        System.out.println(operacion2.sumar(2.1f,3.2f));//DAtos de tipo float
    }
}
