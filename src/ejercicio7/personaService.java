
package ejercicio7;

import java.util.Scanner;


public class personaService {
    
    Scanner sc = new Scanner(System.in);
    Persona p = new Persona();

    public personaService() {
    }
    
    public Persona crearPersona(){
        char sexo;
        
        while (true) {
            System.out.print("Sexo (H/M/O): ");
            sexo = sc.next().toLowerCase().charAt(0);
            if (sexo == 'h' || sexo == 'm' || sexo == 'o') {
                p.setSexo(sexo);
                break; //El sexo es h, m, o, salgo del bucle
            } else {
                System.out.println("Error: [" + sexo + "] no es un sexo válido.");
            }
        }
        System.out.println("Ingrese la edad");
        p.setEdad(sc.nextInt());
        System.out.println("Ingrese altura");
        p.setAltura(sc.nextFloat());
        System.out.println("Ingrese peso");
        p.setPeso(sc.nextShort());
        System.out.println("Los datos fueron ingresados correctamente");
        
        return p;
        }
    
    
    public int calcularMC(Persona persona){
        double pesoIdeal =  p.getPeso()/ (Math.pow(p.getAltura(), 2));
        if(pesoIdeal<20 ){
          return  Persona.pesoMinimo;
        }
        else if ( pesoIdeal>= 20 && pesoIdeal <= 25){
           return Persona.pesoideal;
        }
        else {
            return Persona.sobrePeso;
            
        }
            
        }
    
    public boolean esMayor(Persona persona){
        
        return p.getEdad() >= 18;
       
    }

    
    }

    

        
    
