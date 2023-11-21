/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.mingoalmacen.vista;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import cl.mingoalmacen.model.Conexion;


/**
 *
 * @author Ayleen
 */
public class testMain {
    
    public static void main(String[] args) {
        
    }
    
    public static void mostrarProductos() throws Exception {
        String query = "SELECT * FROM PRODUCTO";
        
        try {
            Connection connection = Conexion.obtenerConexion();
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                int id_prod = resultSet.getInt("ID : ");
                String nombre_prod = resultSet.getString("NOMBRE : ");
                int precio = resultSet.getInt("PRECIO : ");
                int stock = resultSet.getInt("STOCK : ");
                
                System.out.println("id_prod = " + id_prod);
                System.out.println("nombre_prod = " + nombre_prod);
                System.out.println("precio = " + precio);
                System.out.println("stock = " + stock);
            }       
            } catch (SQLException e) {
                System.err.println("Error al obtener la lista de productos: " + e.getMessage());
                    
                    }
            
        
    }
    
    
}
