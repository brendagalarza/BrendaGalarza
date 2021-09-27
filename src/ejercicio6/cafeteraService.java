
package ejercicio6;

import java.util.Scanner;


public class cafeteraService {
    Scanner sc = new Scanner(System.in);
    Cafetera ca;

    
    

    public Cafetera crearCafetera(){
        System.out.println("Ingrese la capacidad Maxima ");
        ca.setCapacicidadMaxima(sc.nextInt());
        System.out.println("Ingrese la cantidad actual ");
        ca.setCapActual(sc.nextInt());
        
        return ca;
    }
    
    public void llenarCafetera(){
        
    ca.setCapActual(ca.getCapacicidadMaxima());
        System.out.println("Se lleno la cafetera");
    }
    
    public void servirTaza(int taza){
        if(taza <= ca.getCapActual()){
            ca.setCapActual(ca.getCapActual()-taza);
            System.out.println("La taza se lleno correctamente");
            System.out.println("Ahora contiene "+ ca.getCapActual());
        }
        else{
            System.out.println("La cafetera contiene " + ca.getCapActual() + "ml, no alcanza par llenar " + taza + "ml de taza");
            ca.setCapActual(0);
        }
        
    }
    
   public void vaciarCafetera(){
        ca.setCapActual(0);
        System.out.println("La cafetera quedo con " + ca.getCapActual());
    
   }
    public void agregarCafe(int cafe){
        
        if(cafe <= ca.getCapacicidadMaxima() - ca.getCapActual()){
            ca.setCapActual(ca.getCapActual()+cafe);
        System.out.println("se agregaron" + cafe + "ml a la cafetera");
        }
        else {
            ca.setCapActual(ca.getCapacicidadMaxima());
            System.out.println("NO SE PUEDE AGREGAR MAS CAFEEE");
        }
        
        System.out.println("La cafetera quedo con " + ca.getCapActual()+ "ml.");
        }
        
}



