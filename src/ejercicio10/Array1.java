
package ejercicio10;

import java.util.Arrays;


public class Array1 {

    
    public static void main(String[] args) {
        
        //relleno y muestros los arreglos
        double arrayA[] = new double [50];
        double arrayB[] = new double[20];
        
        rellenar(arrayA);
        imprimirArray(arrayA);
        
        
         //ordeno el arreglo de menor a mayor
        
        Arrays.sort(arrayA);
        System.out.println("Array A ordenado de menor a mayor");
        imprimirArray(arrayA);
        System.out.println("");
        
        System.out.println("Copio elementos de A en B ");
        //copio los primeros 10 elementos del arrayA en el arrayB
        
        // arrayB = Arrays.copyOfRange(arrayA, 0, 10); // DESDE 0 A 10
        
        System.arraycopy(arrayA, 0, arrayB, 0, 10);
        imprimirArray(arrayB);
        // rellenar los 10 últimos elementos con el valor 0.5.
        Arrays.fill(arrayB, 10, 20, 0.5);
        System.out.println("Array B con el valor agregado");
        imprimirArray(arrayB);
    }
    
    public static void rellenar (double array[]){
        
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round((Math.random()*10+1)*100)/100;
            
        }

    }
    public static void imprimirArray (double array[]){
   
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
            
        }
        System.out.println("");
    }
    
}
