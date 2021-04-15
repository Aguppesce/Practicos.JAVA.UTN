package Trabajos_Practicos.TPN7.Ejercicio2;

public class Item {

    private String descripcion;
    private int preciounitario;
    private int cantidad;

    public Item (String descripcion, int preciounitario) {
        this.descripcion = descripcion;
        this.preciounitario = preciounitario;

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPreciounitario() {
        return preciounitario;
    }

    public void setPreciounitario(int preciounitario) {
        this.preciounitario = preciounitario;
    }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

}
