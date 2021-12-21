public class Mouse extends dispositivoEntrada{
    private int numero;
    public Mouse(String modelo,int numero){
        super(modelo);
        this.numero=numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
