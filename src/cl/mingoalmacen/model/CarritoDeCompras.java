package cl.mingoalmacen.model;

import java.util.List;




/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class CarritoDeCompras{ 
    
    private int precio;
    private String nombre_prod;
    private int cantidad;
    

    public CarritoDeCompras() {
    }

    public CarritoDeCompras(int precio, String nombre_prod, int cantidad) {

        this.precio = precio;
        this.nombre_prod = nombre_prod;
        this.cantidad = cantidad;
    }


    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    
    
}
    
    
