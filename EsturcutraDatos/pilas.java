package EsturcutraDatos;

import java.util.Stack;

public class pilas {
    public static void main(String[] args) {
        Stack <Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);

        for(int i=0;i<pila.size();i++){
            System.out.println(pila.get(i));
        }
        System.out.println(pila);
        pila.pop();
        System.out.println(pila);
        System.out.println("El ultimo elemento agregado fue: "+pila.peek());
        System.out.println("Esta vacio?: "+pila.empty());
        System.out.println("Esta el numero 3? "+pila.search(3));
        System.out.println("Esta el numero 1? "+pila.search(1));
        System.out.println("Esta el numero 7? "+pila.search(7));
    }
}
