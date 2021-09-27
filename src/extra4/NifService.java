
package extra4;

import java.util.Scanner;


public class NifService {
    
    Scanner sc = new Scanner(System.in);
    Nif n = new Nif();
    public Nif CrearNif(){
        
        
        System.out.println("Ingrese su numero de DNI: ");
        n.setDNI(sc.nextLong());
        n.setLetra(calcularNif(n));
        return n;
    }
    
    public String calcularNif(Nif n){
        //relleno el vector con los caracteres dados
        String [] tabla = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        //dni mod 23 me dara una posicion 
        int pos = (int) (n.getDNI()%23);
        //en let guardo la letra que hay en el vector en esa posicion que le paso
        String let = tabla[pos];
        return let;
    }
        
        public void mostrar(Nif n){
            System.out.println("DNI CON SU CORRESPONDIENTE LETRA: "+ n.getDNI()+"-"+n.getLetra());
        }
        
   
    }
    

