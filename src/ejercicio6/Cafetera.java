
package ejercicio6;

public class Cafetera {
    private int capacicidadMaxima;
    private int capActual;

    public Cafetera() {
    }

    public Cafetera(int capacicidadMaxima, int capActual) {
        this.capacicidadMaxima = capacicidadMaxima;
        this.capActual = capActual;
    }

    public int getCapacicidadMaxima() {
        return capacicidadMaxima;
    }

    public void setCapacicidadMaxima(int capacicidadMaxima) {
        this.capacicidadMaxima = capacicidadMaxima;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }
    
    
    
}
