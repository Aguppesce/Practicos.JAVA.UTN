package Trabajos_Practicos.TPN5.Ejercicio3;

public class Auto {

    private String auto;
    private String marca;
    private String modelo;
    private String patente;
    private int km;
    private int ultimocambioAceite;
    private boolean cambioAceite;

    public Auto (String auto, String marca, String modelo, String patente, int km, int ultimocambioAceite) {
        this.auto = auto;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.km = km;
        this.ultimocambioAceite = ultimocambioAceite;
    }


    public Auto(String auto, String marca, String modelo) {
        this.auto = auto;
        this.marca = marca;
        this.modelo = modelo;
    }

    public boolean cambioAceite(){
        boolean cambioAceite=false;
        int cambio;
        if(km%ultimocambioAceite==5000||km%ultimocambioAceite>5000){
            cambio=km%ultimocambioAceite;
            System.out.println("Se paso: "+ (km-ultimocambioAceite+5000));
            System.out.println("Lo tendrian que haber hecho a los "+cambio);
            cambioAceite=true;
        } else if(km%ultimocambioAceite<5000){
            cambio=km%ultimocambioAceite;
            System.out.println("Faltan "+ cambio+" km para el cambio");
            cambioAceite=false;
        }
        return cambioAceite;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getUltimocambioAceite() {
        return ultimocambioAceite;
    }

    public void setUltimocambioAceite(int ultimocambioAceite) {
        this.ultimocambioAceite = ultimocambioAceite;
    }
}