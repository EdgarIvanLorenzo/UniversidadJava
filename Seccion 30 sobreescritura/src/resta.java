public class resta extends operaciones{ //Las clases abstractas en java solo puede ser extendidas

    int n1,n2;

    public resta(int n1,int n2){
        this.n1=n1;
        this.n2=n2;
    }

    //implementacion del metodo abstracto
    @Override
    public int operacion(){
        return this.n1+this.n2;
    }
}
