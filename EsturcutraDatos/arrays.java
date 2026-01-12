package EsturcutraDatos;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        System.out.println("ARRAY");
        int[] arrayInt1 = new int[3];
        arrayInt1 [0] = 1;
        arrayInt1 [1] = 5;
        arrayInt1 [2] = 3;
        System.out.println(arrayInt1[0]);
        System.out.println(arrayInt1[1]);
        System.out.println(arrayInt1[2]);
        
        System.out.println("----------");

        int[] arrayInt2 = {4,3,3};
        System.out.println(arrayInt2[0]);
        System.out.println(arrayInt2[1]);
        System.out.println(arrayInt2[2]);

        System.out.println("----");

        for(int i = 0;i<arrayInt1.length;i++){
            System.out.println(arrayInt1[i]);
        }
        
        System.out.println("---");
        System.out.print("Array Double: ");
        Double[] arrayDouble = {3.1416};
        System.out.println(arrayDouble[0]);
        System.out.print("Array Flota: ");
        Float[] arrayFloat = {2.19F};
        System.out.println(arrayFloat[0]);
        System.out.print("Array Boolean: ");
        Boolean[] arrayBoolean = {true};
        System.out.println(arrayBoolean[0]);
        System.out.print("Array char: ");
        char[] arrayChar = {'A'};
        System.out.println(arrayChar[0]);
        System.out.print("Array string: ");
        String[] arrayString = {"Feel Good"};
        System.out.println(arrayString[0]);


        System.out.println("EJEMPLO INGRESO DE DATOS POR EL USUARIO");
        System.out.println("");

        Scanner teclado = new Scanner(System.in);
        System.out.println("agrege el numero de personas que viven en su casa");
        int nPersonas = teclado.nextInt();
        teclado.nextLine();
        String[] personas = new String[nPersonas];
        
        for(int i=0; i<=nPersonas-1;i++){
            System.out.println("Ingrese el nombre del integrante numero "+(i+1)+" de la familia");
            personas[i] = teclado.nextLine();
        }
        System.out.println("");
        System.out.println("Los integrandes de tu familia son: ");
        for(int i=0;i<personas.length;i++){
            System.out.println(personas[i]);
        }

        teclado.close();
    }
}
