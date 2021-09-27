
package ejercicio5;

public class Cuenta {
    private int NumCuenta;
    private long dni;
    private double saldoActual = 0;
    private double interes;

    public Cuenta() {
    }

    public Cuenta(int NumCuenta, long dni, double saldoActual, double interes) {
        this.NumCuenta = NumCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
    
    
    
}
