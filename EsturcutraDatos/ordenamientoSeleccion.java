package EsturcutraDatos;

import java.util.Scanner;

public class ordenamientoSeleccion {
    public static void main(String[] args) {
        
        int array[], nElementos, aux;
        int poscion = 0;
        Scanner cantElement = new Scanner(System.in);
        //Pedimos el numero de elementos al usuario
        System.out.println("Ingrese la cantidad de elementos");
        nElementos = cantElement.nextInt();
        //guardamos la cantidad de elemtnos en el array
        array = new int [nElementos];
        //creamos un bucle para que el usuario ingrese los elementos
        for(int i=0;i<nElementos;i++){
            System.out.println("Ingrese el numero de la posicion "+(i+1)+" ");
            Scanner element = new Scanner(System.in);
            array[i] = element.nextInt();
        }
               
        for(int i=0;i<nElementos;i++){
            poscion = i;
            //busca el menor elemento en el array
            for(int j=i;j<nElementos;j++){
                //si se encuentra un elemento menor se actualiza la poscion
                if(array[j]<array[poscion]){
                    poscion = j;
                }
            }
            //se guarda el valor menor en aux
            aux = array[i];
            //se coloca el numero menor en su posicion correcta i
            array[i] = array[poscion];
            //se guarda el valor antiguo en la poscion del numero mas pequeño
            array[poscion] = aux;
        }
        for(int i=0;i<nElementos;i++){
            System.out.println(array[i]);
        }
        cantElement.close();
    }
}
