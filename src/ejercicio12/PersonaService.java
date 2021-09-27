
package ejercicio12;

import java.util.Date;
import java.util.Scanner;


public class PersonaService {
    
    Scanner sc = new Scanner(System.in);
    
    public void crearPersona(Persona p){
        int anio,mes,dia;
        System.out.println("Ingrese su nombre: ");
        p.setNombre(sc.next());
        System.out.println("Ingrese su año de nacimiento: ");
        anio = sc.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        mes = sc.nextInt();
        System.out.println("Ingrese su dia de nacimiento :");
        dia = sc.nextInt();
        
        Date nacimiento = new Date(anio-1900,mes-1,dia);
        
        p.setNacimiento(nacimiento);
        
    }
    
    public int calcularEdad(Persona p){
        
        Date fechaActual = new Date();
        
        return (fechaActual.getYear() - p.getNacimiento().getYear());
       
    }
    
    public boolean menorQue(Persona p, int edad){
        PersonaService ps = new PersonaService();
        return edad<ps.calcularEdad(p);
    }
    
    public void mostrarPersona(Persona p){
        System.out.println(p.getNombre() + "nacio " + p.getNacimiento().toString());
    }
    
}
