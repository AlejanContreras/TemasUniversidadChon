package Algoritmos;

import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        System.out.println("crea tu propia tabla");
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        System.out.println("ingrese la cantidad de filas");
        filas = sc.nextInt();
        System.out.println("ingrese la cantidad de columnas");
        columnas = sc.nextInt();
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("ingrese el numero de la posicion "+i+"-"+j+" : ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("los datos se han guardado");
        System.out.println("la tabla se ve de la siguiente manera");
        System.out.println(" ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        sc.close();
    }
}
