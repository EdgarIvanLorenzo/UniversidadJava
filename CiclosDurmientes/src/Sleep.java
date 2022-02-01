public class Sleep {
    public static void main(String[] args) {
        try{
            for (int i=0;i<10;i++){
                System.out.println(i);
                //Hilo thread.Slepp duerme el proceso en lilesegiindos
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
