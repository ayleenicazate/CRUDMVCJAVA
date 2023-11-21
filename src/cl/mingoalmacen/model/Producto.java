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


    @Override
    public String toString() {
        
        String isAvailable = "";
        String cantidad = "";

//        if (available) {
//            isAvailable = "Si";
//        } else {
//            isAvailable = "no";
//        }
//        
//        if (stock==1) {
//            cantidad = "unidad";
//        } else {
//            cantidad = "unidades";
//        }
        
        return "\n" + "Informacion del producto N°"+ this.getId_prod() + "\n"
                + "ID = " + this.getId_prod() + "\n"
                + "Nombre = " + this.getNombre_prod() + "\n"
                + "Precio = $" + this.getPrecio() + "\n"
                + "Unidades = " + this.getStock() + " " + cantidad + "\n" +
                "Disponible = " + isAvailable +
                "\n" + 
                "\n";
    }
}
