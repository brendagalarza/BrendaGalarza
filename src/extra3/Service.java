
package extra3;

import java.util.Scanner;


public class Service {
    
    Scanner sc = new Scanner(System.in);
    
    public Raices crearRaices(){
        Raices r = new Raices();
        System.out.println("Ingrese el valor de a: ");
        r.setA(sc.nextDouble());
        System.out.println("Ingrese el valor de b: ");
        r.setB(sc.nextDouble());
        System.out.println("Ingrese el valor de c: ");
        r.setC(sc.nextDouble());
        return r;
        
        
    }
    
    public double getDiscriminante(Raices r){
        return ((Math.pow(r.getB(), 2)) - 4 * r.getA() * r.getC());
        //(b^2)-4*a*c
    }
    
    public boolean tieneRaices(Raices r){
     
        return getDiscriminante(r)>=0;
    }
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r) == 0;
    }
    
    public void obtenerRaices(Raices r){
       // grado: (-b±√((b^2)-(4*a*c)))/(2*a)
        if (tieneRaices(r)) {
            System.out.println("Muestro la primer solucion: " + ((-r.getB()+ Math.sqrt(getDiscriminante(r)))/2*r.getA()));
            System.out.println("Muestro la segunda solucion: " + ((-r.getB()- Math.sqrt(getDiscriminante(r)))/2*r.getA()));
        }
        else {
            System.out.println("-");
        }
  
        }
    
    public void obtenerRaiz(Raices r){
        if (tieneRaiz(r)) {
            System.out.println("Solucion: " + (-r.getB()+ Math.sqrt(getDiscriminante(r)))/2*r.getA());
            
        }
        else{
            System.out.println("-");
        }
        
    }
    public void calcular(Raices r){
        
        if(tieneRaiz(r)){
            obtenerRaiz(r);
        } else if(tieneRaices(r)){
            obtenerRaices(r);
        } else {
            System.out.println("El sistema no tiene raices.");
        }
    }
    }
        
    

