package Algoritmos;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Ana");
        System.out.println(nombres);   
        nombres.get(0);
        System.out.println(nombres);    
        nombres.set(0, "Luis");  
        System.out.println(nombres);
        nombres.remove(0);   
        System.out.println(nombres);    
        System.out.println(nombres.size());

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Luis");
        System.out.println(nombres);
        System.out.println(nombres.get(1));
        nombres.set(2, "Fernando");
        System.out.println(nombres);
        System.out.println(nombres.size());
        nombres.remove(1);
        System.out.println(nombres.size());

    }
}
