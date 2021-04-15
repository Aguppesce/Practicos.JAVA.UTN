package Trabajos_Practicos.TPN10.Ejercicio1;

public class Terna <T> {
    private T elemento1;
    private T elemento2;
    private T elemento3;

    public Terna(T elemento1, T elemento2, T elemento3) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
        this.elemento3 = elemento3;
    }

    public Terna() {
        this.elemento1 = null;
        this.elemento2 = null;
        this.elemento3 = null;
    }

    public T getElemento(int i) {
        if (elemento1.equals(1)) {
            return elemento1;
        } else if (elemento2.equals(2)) {
            return elemento2;
        } else {
            return elemento3;
        }

    }

    public String toString() {

        return "Terna:" + elemento1 + "," + elemento2 + "," + elemento3 + ",";
    }

    public T setElemento(int i, T elemento) {
        if (i == 1) {
            return elemento1 = elemento;
        } else if (i == 2) {
            return elemento2 = elemento;
        } else {
            return elemento3 = elemento;
        }
    }
}

