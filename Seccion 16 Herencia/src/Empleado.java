public class Empleado extends Persona{
    private double sueldo;
    private static int idEmpleado=0;

    public Empleado(String nombre,String direccion,int edad,char genero,double sueldo){
        super(nombre,direccion,edad,genero);
        this.sueldo=sueldo;
        Empleado.idEmpleado+=1;
    }

    //Metddos de acceso a las variables privadas de los objetos
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }
    public double getSueldo(){
        return this.sueldo;
    }

    //Metodo para obtener el id del empleado
    public int getIdEmpleado(){
        return Empleado.idEmpleado;
    }

    //Sobreescribimos los datos del metodo toString de la clase padre
    @Override
    public String toString(){
        return this.getIdEmpleado()+" "+super.toString()+" "+this.getSueldo();
    }
}
