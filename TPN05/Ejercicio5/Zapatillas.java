package Trabajos_Practicos.TPN5.Ejercicio5;

public class Zapatillas {

    private String modelo;
    private String marca;
    private String industria;
    private int numero;

    public Zapatillas(String modelo, String marca, String industria, int numero) {
        this.modelo = modelo;
        this.marca = marca;
        this.industria = industria;
        this.numero = numero;
    }

    public String getModelo() { return modelo; }

    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public String getIndustria() { return industria; }

    public void setIndustria(String industria) { this.industria = industria; }

    public int getNro() { return numero; }

    public void setNro(int nro) { this.numero = nro; }
}
