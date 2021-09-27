
package ejercicio9;


import java.util.Scanner;

public class MathService {
    
    Scanner sc = new Scanner(System.in);
    
    
   public double devolverMayor(Matematica r){
           return Math.max(r.getNumber1(), r.getNumber2());
    
        
                
    }
   
   public int potencia(Matematica r){
       
      double mayor = Math.round(Math.max(r.getNumber1(), r.getNumber2()));
      double menor = Math.round(Math.min(r.getNumber1(), r.getNumber2()));
      
      
       
       return (int) Math.pow(mayor, menor);
       
       
   }
   
   public double raizCuadrada(Matematica r){
       
       double minimo = Math.abs(Math.min(r.getNumber1(), r.getNumber2()));
       
       return Math.sqrt(minimo);
   }
   
}
