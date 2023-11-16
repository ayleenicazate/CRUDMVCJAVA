package cl.mingoalmacen.model;

import java.util.ArrayList;

/**
 *
 * @author Ayleen Guajardo
 * @version 14/11/2023
 */
public class DataBase { /* DataBase, first name was DataBase but i preferred rename */
    
    private ArrayList<Product> products;
    private ArrayList<Client> users;
    private ArrayList<Client> shoppingCart;
    

    public DataBase() {
        this.products = new ArrayList<>(); 
        this.users = new ArrayList<>(); 
        this.shoppingCart = new ArrayList<>();
        
 /*al inicializar el programa la base de datos simulada se llena con los datos del metodo*/
        agregardatosBdSimulada();
        
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Client> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<Client> users) {
        this.users = users;
    }

    public ArrayList<Client> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Client> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    
    /* metodo para llenar la base de datos simulada*/
    private void agregardatosBdSimulada(){
    this.products.add(new Product(1,"arroz",1200,1, true));
    this.products.add(new Product(2,"arroz",1200,1, true));
    this.products.add(new Product(3,"arroz",1200,2, true));
    this.products.add(new Product(4,"arroz",1200,3, true));
    this.products.add(new Product(5,"arroz",1200,1, true));
    this.products.add(new Product(6,"arroz",1200,1, true));
    this.products.add(new Product(7,"arroz",1200,1, true));
    this.products.add(new Product(8,"arroz",1200,1, true));
    this.products.add(new Product(9,"arroz",1200,1, true));
    }
    
    
}
