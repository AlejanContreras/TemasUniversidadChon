package EsturcutraDatos;

import java.util.Scanner;

public class ordenamientoInsercion {
    
    public static void main(String[] args) {
        //
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
        //recorrer todos los elemntos
        for(int i=1;i<nElementos;i++){
            //guardar el valor de la posicion actual
            poscion = i;
            //guardar el valor en lavariable auxiliar para luego colocar en el lugar correcto
            aux = array[i];
            //Se usa while porque no sabemos cuantas veces se va a repetir o mover el elemento hacia atras
            //mientras no estemos en la primera posicion y el valor de la izquierda sea mayor al valor actual
            while(poscion>0 && array[poscion-1]>aux){
                //mueve el valor mayor a la derecha
                array[poscion] = array[poscion-1];
                //disminuye la poscion para seguir comparando
                poscion--;
            }
            //cuando encuentra la poscion correcta coloca el valor guardado en aux
            array[poscion] = aux;
            }
            for(int i=0;i<nElementos;i++){
                System.out.println(array[i]);
            }
            cantElement.close();
    }
}
