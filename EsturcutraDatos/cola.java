package EsturcutraDatos;

import java.util.LinkedList;
import java.util.Queue;

public class cola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);

        System.out.println(cola);
        cola.poll();
        System.out.println(cola);
        System.out.println("el primer elemento agregado fue: "+cola.peek());
        System.out.println("esta vacio?: "+cola.isEmpty());
        System.out.println("esta el numero 3? "+cola.contains(3));
        System.out.println("esta el numero 3? "+cola.contains(9));
    }
}
