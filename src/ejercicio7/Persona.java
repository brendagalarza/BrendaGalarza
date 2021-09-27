
package ejercicio7;


public class Persona {
    
    private int edad;
    private char sexo;
    private float altura;
    private short peso;
    static  final int pesoMinimo = -1;
    static final int  pesoideal = 0;
    static final int sobrePeso = 1;
   
    
    
    

    public Persona() {
    }

    public Persona(int edad, char sexo, float altura, short peso) {
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    Persona(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    void setSexo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
