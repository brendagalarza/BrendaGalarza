
package ejercicio9;

import java.util.Scanner;


public class NewMain {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        MathService m = new MathService();
        Matematica n = new Matematica();
        
        n.setNumber1(Math.random()*10);
        n.setNumber2(Math.random()*10);
        
        
        
        System.out.println("El primer numero es: " + n.getNumber1());
        System.out.println("El segundo numero es: " + n.getNumber2());
        
        System.out.println("El mayor numero es: "+ m.devolverMayor(n));
        System.out.println("Muestro la potencia del mayor numero elevado al menor numero: "+ m.potencia(n));
        System.out.println("Muestro la raiz cuadrada del menor numero en su valor abs :" + m.raizCuadrada(n));
    }
    
}
