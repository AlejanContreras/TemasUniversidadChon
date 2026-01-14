package EsturcutraDatos;

import java.util.Scanner;

public class ordenamientoBurbuja {
    public static void main(String[] args) {
        
        int array[], nElementos, aux;
        Scanner cantElement = new Scanner(System.in);
        //Pedimos el numero de elementos al usuario
        System.out.println("Ingrese la cantidad de elementos");
        nElementos = cantElement.nextInt();
        
        //En el array agregamos la varaible que contiene la cantidad de elementos a ingresar
        array = new int [nElementos];
        //creamos un bucle para que el usuario ingrese los elementos
        for(int i=0;i<nElementos;i++){
            System.out.println("Ingrese el numero de la posicion "+(i+1)+" ");
            Scanner element = new Scanner(System.in);
            array[i] = element.nextInt();    
        }
        
        System.out.println("");
        //Ciclo for para ordenar
        //proceso de repeticion
        for(int i=0;i<nElementos;i++){
            //comparacion de elemento por elemento
            for(int j=0;j<nElementos-1;j++){
                
                /*condicion de si el array en el elemento de la poscion J
                es mayor que el elemento a su derecha debe cambiar de posicion*/
                
            if(array[j]>array[j+1]){
                //se guarda temporalmente el elemento mayor en auxilar
                aux = array[j];
                //se mueve el numero mas pequeño a la izquierda
                array[j] = array[j+1];
                // se guarda el numero mayor que estaba en auxilar en la posicion a la derecha del elemento posicion J
                array[j+1] = aux;
                }
            }
        }
        //ciclo for para imprimir todo el array
        for(int i=0;i<nElementos;i++){
            System.out.println(array[i]);
        }
        cantElement.close();
        
    }
}
