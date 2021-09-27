
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Fecha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio,mes,dia;
        
        System.out.println("Ingrese el año : ");
        anio = sc.nextInt();
        System.out.println("Ingrrse el mes: ");
        mes = sc.nextInt();
        System.out.println("Ingrese el dia: ");
        dia = sc.nextInt();
        
        Date fecha = new Date(anio-1900,mes,dia);
        System.out.println(fecha.toString());
        
        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());
        System.out.println("La diferencia en años :" + (fechaActual.getYear() - fecha.getYear()));
        
        
       
    }

   
}
