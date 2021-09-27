
public class Ahor {
    private String[] palabra;
    private int cantidadLetras;
    private int intentosMax;

    public Ahor() {
    }

    public Ahor(String[] palabra, int cantidadLetras, int intentosMax) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.intentosMax = intentosMax;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }
    
}

    