public class test {
    public static void main(String[] args) {
        //Creacion de un rectangulo
        rectangulo rectangulo1=new rectangulo();
        rectangulo1.dibujar();//Ejecutamos el metodo abstracto de la clase padre


        //todo ****** Cuando se crea una clase abstracta se tiene que crear el metodo de tipo abstracto
        figuraGeometrica n1=new figuraGeometrica("Rectangulo") {
            @Override
            public void dibujar() {
                System.out.println("Se dibuja un rectangulo");
            }
        };
        n1.dibujar();
    }
}
