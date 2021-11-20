public class tree {
    node raiz;
    public tree(){
        this.raiz=null;
    }

    public void add(int dato){
        node newNode=new node(dato);
        if(this.raiz==null){
            this.raiz=newNode;
        }else{
            addB(this.raiz,newNode);
        }
    }

    public void addB(node node,node newNode){
        if(newNode.dato<node.dato){
            if(node.izquierdo==null){
                node.izquierdo=newNode;
            }else{
                this.addB(node.izquierdo,newNode);
            }
        }else{
            if(node.derecho==null){
                node.derecho=newNode;
            }else{
                this.addB(node.derecho,newNode);
            }
        }
    }

    public void inOrden(node node){
        if(node!=null){
            this.inOrden(node.izquierdo);
            System.out.println(node.dato);
            this.inOrden(node.derecho);
        }
    }

    public void preOrden(node node){
        if(node!=null){
            System.out.println(node.dato);
            this.preOrden(node.izquierdo);
            this.preOrden(node.derecho);
        }
    }

    public void postOrden(node node){
        if(node!=null){
            this.postOrden(node.izquierdo);
            this.postOrden(node.derecho);
            System.out.println(node.dato);
        }
    }

    public void Invertir(node node){
        if(node!=null){
            node doble=node.izquierdo;
            node.izquierdo=node.derecho;
            node.derecho=doble;
            this.Invertir(node.derecho);
            this.Invertir(node.izquierdo);
        }
    }

    public static void main(String[] args) {
        tree arbol1=new tree();
        arbol1.add(10);
        arbol1.add(9);
        arbol1.add(11);
        arbol1.add(8);
        arbol1.inOrden(arbol1.raiz);
        System.out.println("Preorden");
        arbol1.preOrden(arbol1.raiz);
        System.out.println("Postorden");
        arbol1.postOrden(arbol1.raiz);
        arbol1.Invertir(arbol1.raiz);
        System.out.println("Invertido");
        arbol1.inOrden(arbol1.raiz);
    }
}
