package cl.mingoalmacen.model;

import DAO.ICarritoDeCompras;


/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class CarritoDeCompras extends Producto implements ICarritoDeCompras { 
    
    private int id_carrito;
    private int cantidad;
    

    public CarritoDeCompras() {
        super();
    }

    
    
    public CarritoDeCompras(int id_carrito, int cantidad, int id_prod, String nombre_prod, int precio, int stock) {
        super(id_prod, nombre_prod, precio, stock);
        this.id_carrito = id_carrito;
        this.cantidad = cantidad;
    }

    public int getId_carrito() {
        return id_carrito;
    }

    public void setId_carrito(int id_carrito) {
        this.id_carrito = id_carrito;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public boolean agregarProductoAlCarrito(CarritoDeCompras carrito) {
        
    }

    @Override
    public boolean eliminarProductoDelCarrito(int id_carrito) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarCantidadProductoEnCarrito(int id_carrito, int id_producto, int nuevaCantidad) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
   
    
    
//    private ArrayList<Producto> products;
//    
//
//    public CarritoDeCompras() {
//        this.products = new ArrayList<>(); 
//        
// /*al inicializar el programa la base de datos simulada se llena con los datos del metodo*/
//        agregardatosBdSimulada();
//        
//    }
//
//    public ArrayList<Producto> getProducts() {
//        return products;
//    }
//
//    public void setProducts(ArrayList<Producto> products) {
//        this.products = products;
//    }
//
//
//
//
//    
//    /* metodo para llenar la base de datos simulada*/
//    private void agregardatosBdSimulada(){
//    this.products.add(new Producto(1,"arroz",1200,1, true));
//    this.products.add(new Producto(2,"arroz",1200,1, true));
//    this.products.add(new Producto(3,"arroz",1200,2, true));
//    this.products.add(new Producto(4,"arroz",1200,3, true));
//    this.products.add(new Producto(5,"arroz",1200,1, true));
//    this.products.add(new Producto(6,"arroz",1200,1, true));
//    this.products.add(new Producto(7,"arroz",1200,1, true));
//    this.products.add(new Producto(8,"arroz",1200,1, true));
//    this.products.add(new Producto(9,"arroz",1200,1, true));
//    }
    
    
