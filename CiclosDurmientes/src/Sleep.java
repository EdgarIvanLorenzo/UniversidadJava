public class Sleep {
    public static void main(String[] args) {
        try{
            for (int i=0;i<10;i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
