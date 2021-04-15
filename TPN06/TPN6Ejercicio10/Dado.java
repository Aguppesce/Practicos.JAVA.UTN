package Trabajos_Practicos.TPN6.TPN6Ejercicio10;
import java.util.Random;
import java.util.Scanner;

public class Dado {
    private int cantcaras;
    private int valormin;
    private int valormax;
    private int tirar;
    private int n;

    public Dado(int cantcaras, int valormin, int valormax, int tirar, int n) {
        this.cantcaras = cantcaras;
        this.valormin = valormin;
        this.valormax = valormax;
        this.tirar = tirar;
        this.n = n;
    }

    public int getCantcaras() {
        return cantcaras;
    }

    public void setCantcaras(int cantcaras) {
        this.cantcaras = cantcaras;
    }

    public int getValormin() {
        return valormin;
    }

    public void setValormin(int valormin) {
        this.valormin = valormin;
    }

    public int getValormax() {
        return valormax;
    }

    public void setValormax(int valormax) {
        this.valormax = valormax;
    }

    public int getTirar() {
        return tirar;
    }

    public void setTirar(int tirar) {
        this.tirar = tirar;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


}
