
package ejercicio6;


public class NewMain {

    
    public static void main(String[] args) {
        cafeteraService acc = new cafeteraService();
        Cafetera maquina = new Cafetera();
        
        maquina = acc.crearCafetera();
        acc.llenarCafetera();
        acc.servirTaza(5);
        acc.vaciarCafetera();
        acc.agregarCafe(5);
        
   
        
        
    }
    
}
