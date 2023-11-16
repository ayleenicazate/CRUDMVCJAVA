package cl.mingoalmacen.model;

/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class Product {

    private int id;
    private String nameProduct;
    private int price;
    private int units;
    private boolean available;

    public Product() {
    }

    public Product(int id, String nameProduct, int price, int units, boolean available) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.units = units;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        
        String isAvailable = "";
        String cantidad = "";

        if (available) {
            isAvailable = "Si";
        } else {
            isAvailable = "no";
        }
        
        if (units==1) {
            cantidad = "unidad";
        } else {
            cantidad = "unidades";
        }
        
        return "\n" + "Informacion del producto N°"+ this.getId() + "\n"
                + "ID = " + this.getId() + "\n"
                + "Nombre = " + this.getNameProduct() + "\n"
                + "Precio = $" + this.getPrice() + "\n"
                + "Unidades = " + this.getUnits() + " " + cantidad + "\n" +
                "Disponible = " + isAvailable +
                "\n" + 
                "\n";
    }
}
