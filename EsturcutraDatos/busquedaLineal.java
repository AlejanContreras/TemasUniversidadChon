package EsturcutraDatos;

import java.util.Scanner;

public class busquedaLineal {
    public static void main(String[] args) {
        int arreglo[] = {9,5,7,1,3,8,2,4,6,0};
        int dato;
        int posicion = -1;

        System.out.println("Ingrese el número a buscar");
        Scanner sc = new Scanner(System.in);

        dato =sc.nextInt();

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == dato) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            System.out.println("El número no está en el arreglo");
        } else {
            System.out.println("El número está en la posición " + posicion);
        }

    }
}
