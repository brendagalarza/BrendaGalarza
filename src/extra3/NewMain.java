
package extra3;

import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Raices r;
        Service rs = new Service();
        
        r = rs.crearRaices();
        System.out.println("Discriminante : "+ rs.getDiscriminante(r));
 //       System.out.println("Tienes dos soluciones?: " + rs.tieneRaices(r));
 //       System.out.println("Tiene una solucion?: " + rs.tieneRaiz(r));
 //       rs.obtenerRaices(r);
 //       rs.tieneRaiz(r);
        rs.calcular(r);
        
        
        
        
    }
    
}
