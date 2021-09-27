
package extra6;


public class Ahorcado {
    private String [] palabra;
    private int letras;
    private int jugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letras, int jugadas) {
        this.palabra = palabra;
        this.letras = letras;
        this.jugadas = jugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetras() {
        return letras;
    }

    public void setLetras(int letras) {
        this.letras = letras;
    }

    public int getJugadas() {
        return jugadas;
    }

    public void setJugadas(int jugadas) {
        this.jugadas = jugadas;
    }

    public Ahorcado(int jugadas) {
        this.jugadas = jugadas;
    }
    
    
    
}
