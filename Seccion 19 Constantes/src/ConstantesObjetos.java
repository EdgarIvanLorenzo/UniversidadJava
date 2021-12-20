public class ConstantesObjetos {
    private int n;
    public ConstantesObjetos(int n){
        this.n=n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public static void main(String[] args) {
        //Objeto de tipo final
        //Todo cuando creamos constantes de instancias podemos cambiar los datos de los apuntadores mas no
        //Todo podemos realizar una nueva instancia con el mismo objeto
        final ConstantesObjetos n1= new ConstantesObjetos(23);
        System.out.println(n1.getN());

        n1.setN(24);
        System.out.println(n1.getN());
    }
}
