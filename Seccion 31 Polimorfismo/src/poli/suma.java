package poli;

public class suma extends Operaciones{

    public suma(int n1,int n2){
        super(n1,n2);
    }

    //Metodo polimorfismo que mismo metodo distinto resultado
    @Override
    //Solo se pueden utilizar modificadores de acceso con menor restriccion
    //Todo solo se puede utilizar protected o public no private ya que el modificador el protected
     protected void Resultado(){
        System.out.println("El resultado de la suma es de: "+super.numero1+super.numero2);
    }
}
