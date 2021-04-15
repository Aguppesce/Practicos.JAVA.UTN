package Trabajos_Practicos.TPN5.Ejercicio4;

public class Rectangulo {

    private int base;
    private int altura;
    private int perimetro;
    private int area;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPerimetro(){
        return (2*(base+altura));
    }

    public int getArea() {
        return(base*altura);
    }
}
