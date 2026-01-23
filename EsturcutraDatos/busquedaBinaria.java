package EsturcutraDatos;

import java.util.Scanner;

public class busquedaBinaria {
    public static void main(String[] args) {
        
        int[] arreglo = {0,1,2,3,4,5,6,7,8,9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int dato = sc.nextInt();

        int inicio = 0;
        int fin = arreglo.length - 1;
        int posicion = -1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arreglo[medio] == dato) {
                posicion = medio;
                break;
            } else if (dato < arreglo[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        if (posicion == -1) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Encontrado en la posición " + posicion);
        }

    }
}
