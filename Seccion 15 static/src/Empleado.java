public class Empleado extends Persona{
    protected String apar;
    public Empleado(String n,String a,int e,String apartamento){
        super(n,a,e);
        this.apar=apartamento;
    }

    //Se sobreescribe el metodo toString de la clase padre(Persona)
    @Override
    public String toString(){
        //Mandamos a llamar el metodo toString de la clase Persona
        //Se crea la instancia a un objeto de tipo StringBuilder
        StringBuilder cadena=new StringBuilder();
        //Accedemos al metodo toString de la clase padre
        cadena.append(super.toString()).append(" en el departamento ").append(this.apar);
        return cadena.toString(); //Retornamos la cadena de tipo StringBuilder
    }


}
