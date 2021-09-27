
package ejercicio5;

import java.util.Scanner;


public class Cuenta_servicio {
    Scanner sc = new Scanner(System.in);
     Cuenta cliente = new Cuenta();

    public Cuenta_servicio() {
    }
    
    
    public Cuenta crearCuenta (){
        long dni = 0;
        int NumCuenta = 0;
        System.out.println("Ingrese DNI ");
        dni = sc.nextLong();
       
        
        cliente.setDni(dni);
        System.out.println("Ingrese numero de cuenta: ");
        NumCuenta = sc.nextInt();
        
        
        
        cliente.setNumCuenta(NumCuenta);
      
        cliente.setSaldoActual(0);
        cliente.setInteres(0);
        
        System.out.println("La cuenta se ha creado con exito");
        return cliente;
     
     // System.out.println("Ingrese su nro de DNI");
       // cuentaN.setDNI(leer.nextLong());
            
    
}
    
    public  void ingreso(){
        System.out.println("Ingrese su dinero: ");
       double ingreso = sc.nextDouble();
      
       
        cliente.setSaldoActual(cliente.getSaldoActual()+ ingreso);
        System.out.println("Usted ingreso $ "+ ingreso);
        
    }    
    
    
    public void retiro (){
        
        System.out.println("Ingrese la cantidad de dinero a retirar: ");
        double retiro = sc.nextDouble();
        
        if( retiro > cliente.getSaldoActual()){
            System.out.println("Error, no puede retirar esa cantidad");
             }
        else {
            cliente.setSaldoActual(cliente.getSaldoActual() - retiro);
            System.out.println("Se retiraron $ "+ retiro + "de su cuenta");
            
            
        }
    }
    
    public void extraccionRapida(double retiro){
        
        if (retiro <= cliente.getSaldoActual()*0.20) {
            cliente.setSaldoActual(cliente.getSaldoActual()-retiro);
            
        }
        else{
            System.out.println("Error, no se puede retirar esa cantidad de dinero");
        }
    }
    
    public void consultarSaldo(){
        System.out.println("Su saldo actual es de: " + cliente.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Su numero de cuenta es :" + cliente.getNumCuenta() + ". Su dni es : " + cliente.getDni());
    }

    
    }

   
    
    

