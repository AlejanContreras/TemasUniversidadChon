package Algoritmos;

import java.util.Scanner;

public class recursividad {
    public static int fibonacci(int n){
            if(n <= 1){
                return n;
            }else{
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }
    public static void main(String[] args) {
    
        int n;
        System.out.println("Ingrese un numero de repeticiones");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close(); 
        System.out.println("el numero final tras las "+n+" repeticiones es "+fibonacci(n));
        for(int i=0;i<=n; i++){
            System.out.println(fibonacci(i));

        }
    }
}
