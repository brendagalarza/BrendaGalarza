
package ejercicio8;

import java.util.Scanner;



public class cadenaService {
    
    Scanner sc = new Scanner(System.in);
 
    public void mostrarVocales(Cadena fra){
        int vocales=0;
        String letra;
        
        for (int i = 0; i < fra.getLongi(); i++) {
            letra = fra.getFrase().substring(i, i+1);
            if ("a".equals(letra)|| "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra) ||
                    "á".equals(letra) || "é".equals(letra) || "í".equals(letra) || "ó".equals(letra) || "ú".equals(letra)) {
                vocales++;
                
            }
            
        }
        System.out.println("La frase tiene " + vocales + " vocales");
    }
    
    public void invertirFrase(Cadena fra){
        
        String inv = "";
        
        for (int i = fra.getLongi(); i > 0; i--){
            inv += fra.getFrase().substring(i-1, i);
 
        }
        System.out.println("La frase invertida es :" + inv);
        
    }
    
    public void vecesRepetida(Cadena fra){
        int cont = 0;
        String letra;
        System.out.println("Ingrese una letra ");
        letra = sc.next();
        
         for (int i = 0; i < fra.getLongi(); i++) {
             if(fra.getFrase().substring(i, i+1).equals(letra)){
                 cont++;
                 
             }

        }
         System.out.println("La letra se repite "+ cont + "en la frase");
        
    }
    
    public void compararLongitud(Cadena fra){
        String frase2 =" ";
        System.out.println("Ingrese la nueva frase ");
        frase2 = sc.next();
      if (fra.getFrase().compareTo(frase2) == 0)
   System.out.println("cadena1 y cadena2 son iguales");
      else{
          System.out.println("Las longitudes no coindiden");
      }
    }
    
    public void unirFrase(Cadena fra){
        String frase3;
        System.out.println("Ingrese la frase 3 ");
        frase3 = sc.next();
        
        System.out.println(fra.getFrase().concat(frase3));
        
        
    }
    
   /* public void reemplazar(Cadena fra){
        String letra;
        System.out.println("Ingrese la letra: ");
        letra = sc.next();
        System.out.println(fra.getFrase().replace("a", letra));
        
    }*/
    
    public void reemplazar(Cadena fra){
        char letra;
        System.out.println("Ingresar letra: ");
        letra = sc.next().charAt(0);
        System.out.println(fra.getFrase().replace('a', letra));
    }
    
    public boolean contiene(Cadena fra) {
        String letra;
        letra = sc.next();
        return fra.getFrase().contains(letra);
    }
}

  
    
    
