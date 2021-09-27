
package extra2;

import java.util.Scanner;

public class PuntoService {
    
    Scanner sc = new Scanner(System.in);
    
    public void crearPuntos(Punto p){
        
        System.out.println("Ingrese x1");
        p.setX1(sc.nextInt());
        System.out.println("Ingrese y1");
        p.setY1(sc.nextInt());
        System.out.println("Ingrese x2");
        p.setX2(sc.nextInt());
        System.out.println("Ingrese y2");
        p.setY2(sc.nextInt());
    }
    
    public double calcularDistancia(Punto p){
        return Math.sqrt(Math.pow(p.getX2()-p.getX1(), 2)+ Math.pow(p.getY2()-p.getY1(), 2));
    }
}
