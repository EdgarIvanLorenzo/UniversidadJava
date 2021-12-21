public class Monitor {
    static int idMonitor;
    private String marca;
    private int tamano;
    private int numero;
    public Monitor(String modelo,int t,int numero){
        this.marca=modelo;
        this.numero=numero;
        this.tamano=t;
        Monitor.idMonitor++;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
