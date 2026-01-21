package Algoritmos;

import java.util.Scanner;

public class tryCatch {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Ingrese el dividendo");
            double dividendo = sc.nextDouble();
        
            System.out.println("Ingrese el divisor");
            double divisor = sc.nextDouble();
        
            if (divisor == 0) {
                throw new ArithmeticException();
            }
        
            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0");
        } catch (Exception e) {
            System.out.println("Entrada inválida"); 
        } finally {
            sc.close();
            System.out.println("Fin del programa");
        }
        

    }
}
