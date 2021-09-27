
package extra2;


public class NewMain {

    
    public static void main(String[] args) {
        PuntoService ps = new PuntoService();
        Punto p = new Punto();
        
        ps.crearPuntos(p);
        System.out.println("muestro la distancia entre los dos puntos: " + ps.calcularDistancia(p));
    }
    
}
