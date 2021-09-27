
package ejercicio5;


public class NewMain {

    
    public static void main(String[] args) {
        
        Cuenta_servicio datos = new Cuenta_servicio();
        Cuenta persona = new Cuenta();
        
        
        persona = datos.crearCuenta();
        
        datos.ingreso();
        datos.retiro();
        datos.extraccionRapida(500);
        datos.consultarDatos();
        datos.consultarSaldo();
        
        
        
       
    }
}
