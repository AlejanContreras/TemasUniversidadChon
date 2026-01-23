package EsturcutraDatos;

import java.util.LinkedList;

public class listasEnlazadas {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(10);
        lista.add(15);
        lista.add(20);
        System.out.println(lista);

        lista.addFirst(5);
        System.out.println(lista);

        lista.addLast(25);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.get(3));

        lista.remove(Integer.valueOf(20));
        System.out.println(lista);

        System.out.println(lista.contains(10));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
    }
}
