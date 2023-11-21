/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import cl.mingoalmacen.model.Producto;
import java.util.ArrayList;

/**
 *
 * @author Ayleen
 */
public interface IProductoDAO {
    
    /**
     *  Método para obtener los productos de la Base de Datos
     *  
     * Método que ingresa una query SELECT * FROM PRODUCTO.
     * 
     * @return ArrayList<Producto>.
     * 
     */
    abstract  ArrayList<Producto>obtenerTodosLosProductos();
}
