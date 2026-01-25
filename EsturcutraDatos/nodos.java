package EsturcutraDatos;

public class nodos {
    //SIMPLE
    static class NodoSimple{
        int dato1NS, dato2NS;
        NodoSimple next;
        public NodoSimple(int dato1NS, int dato2NS){
            this.dato1NS = dato1NS;
            this.dato2NS = dato2NS;
            this.next = null;
        }
         public String toString() {
        return "Nodo{dato1= " + dato1NS + ", dato2= "+ dato2NS +", next= " + next + "}";
    }
    }
    
    //DOBLE
    static class NodoDoble{
        int dato1ND, dato2ND;
        NodoDoble next;
        NodoDoble prev;
        public NodoDoble(int dato1ND, int dato2ND) {
            this.dato1ND = dato1ND;
            this.dato2ND = dato2ND;
            this.next = null;
            this.prev = null;
        }
        public String toString() {
            return "NodoDoble{dato1=" + dato1ND +
                   ", dato2=" + dato2ND +
                   ", prev=" + prev +
                   ", next=" + next + "}";
        }
    }

   

    public static void main(String[] args) {
        //SIMPLE
        NodoSimple ns = new NodoSimple(10,20);
        
        System.out.println("NODO SIMPLE");
        System.out.println(ns.dato1NS);
        System.out.println(ns.next);
        System.out.println(ns);

        System.out.println("\n");

        //DOBLE
        NodoDoble nd = new NodoDoble(30, 40);

        System.out.println("NODO DOBLE");
        System.out.println(nd.dato1ND);
        System.out.println(nd.next);
        System.out.println(nd.prev);
        System.out.println(nd);

        System.out.println("\n");

        //CIRCULAR
        

    }
}
