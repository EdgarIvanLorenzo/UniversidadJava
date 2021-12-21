public class Teclado extends dispositivoEntrada{
    private int numero;
    public Teclado(String modelo,int numero){
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
