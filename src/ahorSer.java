
import java.util.Scanner;


public class ahorSer {
    
    Scanner sc = new Scanner(System.in);
    Ahor a = new Ahor();
    
    public Ahor crearJuego(){
        System.out.println("Ingrese la palabra a buscar ");
        String pa = sc.next();
        System.out.println("Ingrese los intentos maximos ");
        a.setIntentosMax(sc.nextInt());
        String [] vect = new String[pa.length()];
        for (int i = 0; i < pa.length(); i++) {
            vect[i]= pa.substring(i, i+1);

        }
        a.setCantidadLetras(0);
        a.setPalabra(vect);
        return a;
    }
    public int longitud(Ahor a){
        return a.getPalabra().length;
    }
    public void buscar(Ahor a, String letra){
        int cont = 0;
        String [] vect = a.getPalabra();
        for (int i = 0; i <longitud(a); i++) {
           if (letra.equals(vect[i])) {
            cont++;
        }

        }
        if (cont>0) {
            System.out.println("La letra ingresada es correcta");
            
        }
        else{
            System.out.println("NO ACERTASTE");
        }
    }
    public boolean encontradas(Ahor a, String letra){
        boolean existe = true;
        int encontradas = 0;
        int cont=0;
        
        String [] vect = a.getPalabra();
        for (int i = 0; i < longitud(a); i++) {
            if (letra.equals(vect[i])) {
                a.setCantidadLetras(a.getCantidadLetras()+1);
                
                cont++;
      
            }
            
            
        }
        if (cont==0) {
            existe=false;
            
        }
        encontradas = a.getCantidadLetras();
        int faltantes =  longitud(a)- encontradas;
        System.out.println("Número de letras (encontradas, faltantes): ("+ encontradas +", "+ faltantes +")");
        
        return existe;
    }
    
    public int intentos(Ahor a){
        
        return a.getIntentosMax();
        
    }
    public void juego(Ahor a){
        
        while (a.getIntentosMax()>0) {
            System.out.println("Ingrese una letra");
            String letra = sc.next();
            System.out.println("Longitud: "+ longitud(a));
            buscar(a,letra);
            if (!encontradas(a,letra)) {
                a.setIntentosMax(a.getIntentosMax()-1);
                
            }
            if (a.getCantidadLetras()==longitud(a)) {
                System.out.println("GANASTE!");
                break;
                
            }
            System.out.println("Numero de oportunidades restantes: "+intentos(a));
            
            
        }
        
    }
    
}
