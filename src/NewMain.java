
import java.util.Scanner;


public class NewMain {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ahorSer as= new ahorSer();
        Ahor a;
        
        a = as.crearJuego();
        as.juego(a);
    }
    
}
