package Arbol;

public class arbol {
    node raiz;
    public arbol(){
        this.raiz=null;
    }
    public void add(int dato){
        node newNode=new node(dato);
        if(this.raiz==null){
            this.raiz=newNode;
        }else{
            buscarLugar(this.raiz,newNode);
        }
    }

    public void buscarLugar(node node,node newNode){
        if(newNode.dato<node.dato){
            if(node.izquierdo==null){
                node.izquierdo=newNode;
            }else{
                buscarLugar(node.izquierdo,newNode);
            }
        }else{
            if(node.derecho==null){
                node.derecho=newNode;
            }else{
                buscarLugar(node.derecho,newNode);
            }
        }
    }

    public void preOrden(node node){
        if(node!=null){
            System.out.print("\t"+node.dato);
            preOrden(node.izquierdo);
            preOrden(node.derecho);
        }
    }

    public void inOrden(node node){
        if(node!=null){
            inOrden(node.izquierdo);
            System.out.print("\t"+node.dato);
            inOrden(node.derecho);
        }
    }

    public void postOrden(node node){
        if(node!=null){
            postOrden(node.izquierdo);
            postOrden(node.derecho);
            System.out.print("\t"+node.dato);
        }
    }


    public static void main(String[] args) {
        //Creamos un objeto de la clase arbol
        arbol arbol1=new arbol();
        arbol1.add(9);
        arbol1.add(2);
        arbol1.add(3);
        arbol1.add(10);
        arbol1.add(32);
        System.out.println("Recorrido preOrden");
        arbol1.preOrden(arbol1.raiz);
        System.out.println();
        System.out.println("Recorrido inOrden");
        arbol1.inOrden(arbol1.raiz);
        System.out.println();
        System.out.println("Recorrido postOrden");
        arbol1.postOrden(arbol1.raiz);
    }
}
