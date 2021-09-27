
package extra6;

import java.util.Scanner;


public class ahorcadoSer {
    Scanner sc = new Scanner(System.in);
    
    Ahorcado a = new Ahorcado();
    


  
    
    public Ahorcado crearJuego(){
        //Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
        System.out.println("Ingrese la palabra a buscar: ");
        String pa = sc.next();
        System.out.println("Ingrese la cantidad de jugadas maximas");
        a.setJugadas(sc.nextInt());
        //Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector.
        String [] vec = new String [pa.length()];
        
        //Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la
        //palabra en un índice del vector.
        for (int i = 0; i < pa.length(); i++) {
            vec[i] = pa.substring(i, i+1);
        }
        //guarda en el atributo vector "palabra" la palabra ingresada por el usuario
        a.setPalabra(vec);
        //guarda las letras encontradas en la posicion 0
        a.setLetras(0);
        //guarda en cantidad de jugadas máximas, el valor que ingresó el usuario
        
        return a;
        
    }
    
    //Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
    //buscar como se usa el vector.length.
    public int longitud(Ahorcado a){
        return a.getPalabra().length;
    }
    
    //Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
   //letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    //agrege aca en metodo "encontradas"
    
    public void buscar(Ahorcado a, String letra){
        String[] vec = a.getPalabra();
        boolean correcto = false;

        for (int i = 0; i < a.getPalabra().length; i++) {
  
            if (letra.equals(vec[i])) {
         
                correcto = true;
               
          }
        }
            if (correcto) {
                System.out.println("La letra ingresada  existe");
                
            }
            else{
                System.out.println("La letra no existe");
            }
                
            
        }

            
    public boolean encontradas(Ahorcado a,String letra){
        
        String[] vec = a.getPalabra();
        int cont = 0;

        boolean encontrada = true;
        for (int i = 0; i < longitud(a); i++) {
            
            if (letra.equals(vec[i])) {
                cont++;
                a.setLetras(a.getLetras() + 1);

            }
        }
        if (cont == 0) {
            encontrada = false;

        }
        int enc = a.getLetras();
        int faltantes = longitud(a) - enc;
        System.out.println("Número de letras (encontradas, faltantes): (" + enc + "," + faltantes + ")");

        return encontrada;
    }
        //Metodo intentos() que muestra la cantidad de intentos que tiene el jugador
        public int intentos(Ahorcado a){
            return a.getJugadas();
 
        }
        public String ingresarLetra(Ahorcado a) 
    {
     //me falta hacer un chequeo de que la persona ingrese siempre letras distintas!
     System.out.println("Ingrese una letra: ");
     String letra= sc.next();
     return letra;
    }
        public void juego(Ahorcado a){
            while (a.getJugadas()>0) {
                
                String letra;
                letra = ingresarLetra(a);
                System.out.println("Longitud: " + longitud(a));
                buscar(a,letra);
                
                if (!encontradas(a,letra)) {
                    a.setJugadas(a.getJugadas()-1);
                    
                }
                System.out.println("Le quedan: " + intentos(a) + "intentos");
                if (a.getLetras()== longitud(a)) {
                    System.out.println("Ganaste!");
                    break;
                    
                }

            }
            System.out.println("Superaste todos los intentos.");
        }
        
    
    
}

