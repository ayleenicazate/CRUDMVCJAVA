package cl.mingoalmacen.model;

/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class Producto {

    private int id_prod;
    private String nombre_prod;
    private int precio;
    private int stock;

    public Producto() {
    }

    public Producto(int id_prod, String nombre_prod, int precio, int stock) {
        this.id_prod = id_prod;
        this.nombre_prod = nombre_prod;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
