
package ejercicio12;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        PersonaService ps = new PersonaService();
        Persona p1 = new Persona();
        
        ps.crearPersona(p1);
        System.out.println("Persona A tiene : " + ps.calcularEdad(p1) + "años");
        System.out.println("La persona es mayor de edad? " + ps.menorQue(p1, 20));
        ps.mostrarPersona(p1);
        
    }
    
}
