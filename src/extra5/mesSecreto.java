/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra5;

import java.util.Scanner;

/**
 *
 * @author anton
 */
public class mesSecreto {
    Scanner sc = new Scanner(System.in);
    String [] mes ={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    String mesSecreto = mes[9];
    String ingreso;
    
    public void adivinar(){
       
        do {
            System.out.println("Adivine el mes secreto: ");
            ingreso = sc.next().toLowerCase();
            if (ingreso.equals(mesSecreto)) {
                System.out.println("Usted ha acertado!");}
            
            else{
                System.out.println("No ha acertado. Intente nuevamente ingresando otro mes: ");
                
            }

        } while (!ingreso.equals(mesSecreto));

    }
    public static void main(String[] args) {
        mesSecreto mes = new mesSecreto();
        mes.adivinar();
        
        
        
        
    }
    
}


