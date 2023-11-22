/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.controller;

import DAO.ProductoDAO;
import cl.mingoalmacen.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author Ayleen
 */
public class ControladorProducto {
    
    public static void imprimirProductos(){
        
        ProductoDAO prodDao = new ProductoDAO();
        
        ArrayList<Producto> productoBuscados = prodDao.obtenerTodosLosProductos();
        
        for (Producto productoBuscado : productoBuscados) {
            System.out.println(productoBuscado);
        }
        
    }
    
    public static 

}
