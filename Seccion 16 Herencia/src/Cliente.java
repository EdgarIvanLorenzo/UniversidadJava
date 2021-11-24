import java.util.Date;
public class Cliente extends Persona{
    private static int idCliente=0;
    private String fechaRegistro;
    private boolean vip;

    public Cliente(String nombre,String direccion,int edad,char genero,String fecha,boolean vip){
        super(nombre,direccion,edad,genero);
        this.vip=vip;
        this.fechaRegistro=fecha;
        Cliente.idCliente+=1;
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int idCliente) {
        Cliente.idCliente = idCliente;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString(){
        return Cliente.idCliente+" "+super.toString()+" "+this.getFechaRegistro()+" "+this.isVip();
    }
}
