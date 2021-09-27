
package ejercicio8;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       cadenaService f = new cadenaService();
       Cadena fra = new Cadena();
       
        System.out.println("Ingrese la palabra o frase");
        fra.setFrase(sc.nextLine());
        fra.setLongi(fra.getFrase().length());
        
        f.mostrarVocales(fra);
        f.invertirFrase(fra);
        f.vecesRepetida(fra);
        f.compararLongitud(fra);
        f.unirFrase(fra);
       
        f.reemplazar(fra);
        System.out.println(f.contiene(fra));
        
        
       
       
    }
    
}