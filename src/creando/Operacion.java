
package creando;

import java.util.Scanner;




public class Operacion {
    
    private int num1;
    private int num2;

    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer numero ");
        num1 = sc.nextInt();
        System.out.println("Digite el segundo numero ");
        num2 = sc.nextInt();
       
    }
    public int sumar(){
        int suma = num1+num2;
        return suma;
    }
    public int restar(){
        int resta = num1-num2;
        return resta;
    }
    public int multiplicar(){
        if (num1== 0 || num2 == 0) {
            System.out.println("Error");
            return 0; }
            else {
                int multiplicacion = num1*num2;
                        return multiplicacion;
                    }
            
        }
    
    public int division(){
        if(num1== 0 || num2== 0){
            System.out.println("Error");
            return 0;}
        else {
         int   dividir = num1 / num2;
         return dividir;
        }
    }
    
    
    
    
    
    
    
}

    
    
    