
package ejercicio4;

import java.util.Scanner;


public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura ");
        altura = sc.nextDouble();
    }
    
    public double superficie(){
        double su = base * altura;
        return su;
    }
    
    public double perimetro(){
        double per = (base * altura) * 2;
        return per;
    }
    
    public void dibujarRectangulo (){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura-1 || j == 0 || j == base-1){
                    System.out.print("* ");
                }
                else{
                System.out.print("  ");
                
            }
               
            
        }
             System.out.println("");
        }
    }
}




//Superficie = base * altura / Perímetro = (base + altura) * 2.